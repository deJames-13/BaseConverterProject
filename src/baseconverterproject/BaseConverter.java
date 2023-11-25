package baseconverterproject;

import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;

public class BaseConverter {

    private final LinkedHashMap<String, Object> messageMap = new LinkedHashMap<>();

    private String result;
    private int fromBase;
    private int toBase;
    private String input;

    public BaseConverter() {
    }

    public String convertBase(String number, int fromBase, int toBase) {
        if (!isValidBase(number, fromBase)) {
            throw new IllegalArgumentException(
                    "Number is not valid for the given base!\nPlease enter values from 0 to " + (fromBase - 1));
        }
        if (fromBase < 2 || toBase < 2) {
            throw new IllegalArgumentException("Base must be greater than or equal to 2");
        }
        if (number == null || number.isEmpty()) {
            throw new IllegalArgumentException("Number cannot be null or empty");
        }

        this.input = number;
        this.toBase = toBase;
        this.fromBase = fromBase;

        if (number.contains(".")) {
            String[] parts = number.split("\\.");
            String integerPart = parts[0];
            String fractionalPart = parts[1];

            messageMap.put("title_0", "INTEGER number: " + integerPart + "\t " + "FRACTIONAL part: " + fractionalPart);

            String integerResult = convertBase(number, fromBase, toBase);
            String fractionalResult = convertFractionalPart(fractionalPart, fromBase, toBase);
            fractionalResult = fractionalResult.contains(".") ? fractionalResult.split("0.")[1] : fractionalResult;
            result = integerResult + "." + fractionalResult;

            while (result.endsWith("0")) {
                result = result.substring(0, result.length() - 1);
            }

            return result;
        }

        BigInteger base10Value;
        if (fromBase != 10) {
            messageMap.put("title_1", "INTEGER NUMBER: " + number + " TO BASE 10.");
            base10Value = integerToBase10(new BigInteger(number, fromBase), fromBase);
            messageMap.put("title_2", "CONVERTED TO BASE 10: " + base10Value);
        } else {
            base10Value = new BigInteger(number);
        }

        if (toBase != 10) {
            messageMap.put("title_3", "CONVERTING BASE 10: " + base10Value + " TO BASE " + toBase + ".");
            result = integerFromBase10(base10Value, toBase);
            messageMap.put("title_4", "INTEGER CONVERTED FROM BASE 10: " + result);
        } else {
            result = base10Value.toString();
        }

        return result;
    }

    private boolean isValidBase(String number, int base) {
        for (int i = 0; i < number.length(); i++) {
            char currentChar = number.charAt(i);
            if (currentChar == '.') {
                continue;
            }
            int digit;
            try {
                digit = Integer.parseInt("" + currentChar, base);
            } catch (NumberFormatException e) {
                return false;
            }
            if (digit >= base) {
                return false;
            }
        }
        return true;
    }

    private String convertFractionalPart(String number, int fromBase, int toBase) {
        BigInteger base10Value;

        if (fromBase != 10) {
            messageMap.put("title_5", "CONVERTING FRACTION: " + number + " TO BASE 10.");
            base10Value = fractionToBase10(number, fromBase);
            messageMap.put("title_6", "FRACTIONAL BASE 10: " + String.format("%.7f", base10Value));
        } else {
            base10Value = new BigInteger(number);
        }

        if (toBase != 10) {
            messageMap.put("title_7",
                    "CONVERTING FRACTION BASE 10: " + String.format("%.7f", base10Value) + " TO BASE " + toBase + ".");
            result = fractionFromBase10(base10Value, toBase);
            messageMap.put("title_8", "FRACTION CONVERTED FROM BASE10: " + result);
        } else {
            result = base10Value.toString();
        }

        return result;
    }

    private BigInteger fractionToBase10(String number, int fromBase) {
        BigInteger result = BigInteger.ZERO;
        int power = -1;

        messageMap.put("theader_1", new String[]{"Character - Digit", "fromBase", "Exponent", "Result"});

        for (int i = 0; i < number.length(); i++) {
            char character = number.charAt(i);
            int digit = Character.digit(character, fromBase);
            BigInteger base10Digit = BigInteger.valueOf(digit).multiply(BigInteger.valueOf(fromBase).pow(power));
            result = result.add(base10Digit);

            messageMap.put("trow_1_" + i,
                    new String[]{character + " - " + digit, fromBase + "", power + "", base10Digit.toString()});

            power--;
        }
        return result;
    }

    private String fractionFromBase10(BigInteger base10value, int toBase) {
        int digitCounts = 5;
        StringBuilder resultBuilder = new StringBuilder();

        messageMap.put("theader_2", new String[]{"Base 10 * toBase", "Fractional Part", "Integer Part", "Result"});

        for (int i = 0; i < digitCounts; i++) {
            BigInteger product = base10value.multiply(BigInteger.valueOf(toBase));
            base10value = product;

            BigInteger integerPart = base10value.divide(BigInteger.valueOf(toBase));
            String toStr = integerPart.toString(Character.MAX_RADIX).toUpperCase();
            resultBuilder.append(toStr);
            base10value = base10value.subtract(integerPart.multiply(BigInteger.valueOf(toBase)));

            messageMap.put("trow_2_" + i,
                    new String[]{product.toString(), base10value.toString(), integerPart.toString(), resultBuilder.toString()});

        }

        return resultBuilder.toString();
    }

    private BigInteger integerToBase10(BigInteger number, int fromBase) {
        BigInteger result = BigInteger.ZERO;
        int power = 0;

        messageMap.put("theader_3", new String[]{"Character - Digit", "fromBase", "Exponent", "Result"});

        String numberStr = number.toString(Character.MAX_RADIX).toUpperCase();
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            char currentChar = numberStr.charAt(i);

            if (currentChar == '.') {
                continue;
            }

            int digit;
            if (Character.isDigit(currentChar)) {
                digit = Character.getNumericValue(currentChar);
            } else {
                digit = Character.digit(currentChar, fromBase);
            }
            BigInteger base10Digit = BigInteger.valueOf(digit).multiply(BigInteger.valueOf(fromBase).pow(power));
            result = result.add(base10Digit);

            messageMap.put("trow_3_" + i,
                    new String[]{currentChar + " - " + digit, fromBase + "", power + "", base10Digit.toString()});

            power++;
        }
        return result;
    }

    private String integerFromBase10(BigInteger number, int toBase) {
        StringBuilder result = new StringBuilder();

        messageMap.put("theader_4", new String[]{"Number", "To Base", "Remainder", "Result"});
        int i = 0;
        while (number.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] divisionResult = number.divideAndRemainder(BigInteger.valueOf(toBase));
            result.insert(0, divisionResult[1].toString(Character.MAX_RADIX).toUpperCase());

            messageMap.put("trow_4_" + i,
                    new String[]{number.toString(), toBase + "", divisionResult[1].toString(), result.toString()});

            number = divisionResult[0];
            i++;
        }

        return result.toString();
    }

    public void printMessage() {
        for (Map.Entry<String, Object> entry : messageMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            System.out.print(key + ": ");

            if (value instanceof String[]) {
                String[] arrayValue = (String[]) value;
                System.out.print("[");
                for (int i = 0; i < arrayValue.length; i++) {
                    System.out.print(arrayValue[i]);
                    if (i < arrayValue.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            } else {
                System.out.println(value);
            }
        }
    }

    public LinkedHashMap<String, Object> getSolutionMap() {
        return messageMap;
    }

    public String getResult() {
        return result;
    }

    public int getToBase() {
        return this.toBase;
    }

    public int getFromBase() {
        return this.fromBase;
    }

    public String getInput() {
        return this.input;
    }

    public void clearMap() {
        messageMap.clear();
    }
}
