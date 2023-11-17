package baseconverterproject;

public class BaseConverter {

    BaseConverter() {
    }

    public String convertBase(String number, int fromBase, int toBase) {
        // ERROR HANDLING

        // CHECKS FOR VALID DIGIT IN NUMBER
        if (!isValidBase(number, fromBase)) {
            throw new IllegalArgumentException("Number is not valid for the given base");
        }

        if (fromBase < 2 || toBase < 2) {
            throw new IllegalArgumentException("Base must be greater than or equal to 2");
        }

        if (number == null || number.isEmpty()) {
            throw new IllegalArgumentException("Number cannot be null or empty");
        }

        if (!isValidBase(number, fromBase)) {
            throw new IllegalArgumentException("Number is not valid for the given base");
        }
        // #####################################################################

        // CHECKS FOR FLOATING POINT VALUES
        if (number.contains(".")) {
            String[] parts = number.split("\\.");
            String integerPart = parts[0];
            String fractionalPart = parts[1];

            String integerResult = convertBase(integerPart, fromBase, toBase);
            String fractionalResult = convertFractionalPart(fractionalPart, fromBase, toBase);
            String result = integerResult + "." + fractionalResult;

            while (result.endsWith("0")) {
                result = result.substring(0, result.length() - 1);
            }
            return result;
        }

        // ELSE IF INTEGER, DIRECTLY CONVERT IT INSTEAD
        int base10Value = fromBase != 10 ? convertToBase10(number, fromBase) : Integer.parseInt(number);
        String result = convertFromBase10(base10Value, toBase);
        return result;
    }

    // VALIDATES USER INPUT
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

    // CONVERTS THE FLOATING POINT VALUE TO PROPER BASE
    private String convertFractionalPart(String number, int fromBase, int toBase) {
        double result = 0;
        int power = -1;

        for (int i = 0; i < number.length(); i++) {
            int digit = Character.digit(number.charAt(i), fromBase);
            result += digit * Math.pow(fromBase, power);
            power--;
        }

        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            result *= toBase;
            int integerPart = (int) result;
            resultBuilder.append(Integer.toString(integerPart, toBase).toUpperCase());
            result -= integerPart;
        }

        return resultBuilder.toString();
    }

    private int convertToBase10(String number, int fromBase) {
        int result = 0;
        int power = 0;

        for (int i = number.length() - 1; i >= 0; i--) {
            char currentChar = number.charAt(i);

            if (currentChar != '.') {
                int digit;
                if (Character.isDigit(currentChar)) {
                    digit = Character.getNumericValue(currentChar);
                } else {
                    digit = Character.digit(currentChar, fromBase);
                }

                result += digit * Math.pow(fromBase, power);
                power++;
            }
        }

        return result;
    }

    private String convertFromBase10(int number, int toBase) {
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            int remainder = number % toBase;
            result.insert(0, Integer.toString(remainder, toBase).toUpperCase());
            number /= toBase;
        }

        return result.toString();
    }
}
