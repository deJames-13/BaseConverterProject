package baseconverterproject;

public class BaseConverter {

    BaseConverter() {
    }

    ;

    public String convertBase(String number, int fromBase, int toBase) {

        if (number == null || number.isEmpty()) {
            throw new IllegalArgumentException("Number cannot be null or empty");
        }

        if (!number.matches("[0-9]+(\\.[0-9]+)?")) {
            throw new IllegalArgumentException("Number must be numeric");
        }

        if (!isValidBase(number, fromBase)) {
            throw new IllegalArgumentException("Number is not valid for the given base");
        }

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

        if (fromBase < 2 || toBase < 2) {
            throw new IllegalArgumentException("Base must be greater than or equal to 2");
        }
        int base10Value = convertToBase10(number, fromBase);
        String result = convertFromBase10(base10Value, toBase);

        return result;
    }

    private boolean isValidBase(String number, int base) {
        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            if (digit >= base) {
                return false;
            }
        }
        return true;
    }

    private String convertFractionalPart(String number, int fromBase, int toBase) {
        double result = 0;
        int power = -1;

        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            result += digit * Math.pow(fromBase, power);
            power--;
        }

        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            result *= toBase;
            int integerPart = (int) result;
            resultBuilder.append(integerPart);
            result -= integerPart;
        }

        return resultBuilder.toString();
    }

    private int convertToBase10(String number, int fromBase) {
        int result = 0;
        int power = 0;

        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(number.charAt(i));
            result += digit * Math.pow(fromBase, power);
            power++;
        }

        return result;
    }

    private String convertFromBase10(int number, int toBase) {
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            int remainder = number % toBase;
            result.insert(0, remainder);
            number /= toBase;
        }

        return result.toString();
    }

}
