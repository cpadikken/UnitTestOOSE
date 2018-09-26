package StringCalculator;

public class StringCalculator {

    public static int add(String numbers) {
        if (numbers == "") {
            return 0;
        } else {
            if (checkValidityString(numbers)) {
                return parseString(numbers);
            } else {
                throw new IllegalArgumentException("Invalid parameters, please enter digits optionally separated by commas");
            }
        }
    }

    public static boolean checkValidityString(String possibleNumbers) {
        for (int i = 0; i < possibleNumbers.length(); i++) {
            if (!Character.isDigit(possibleNumbers.charAt(i)) && possibleNumbers.charAt(i) != ',' && possibleNumbers.charAt(i) != '-') {
                return false;
            }
        }
        return true;
    }

    public static int parseString(String numbers) {
        if (checkStringLength(numbers) == 1 && !checkForCommas(numbers)) {
            return Integer.parseInt(numbers);
            // moet nog iets gebeuren als iemand alleen maar komma's opgeeft
        } else /*if (checkStringLength(numbers) > 1*/ {
            return addNumbersUpFromIntArray(parseStringToIntArray(numbers));
        }
    }

    public static int checkStringLength(String numbers) {
        return numbers.length();
    }

    public static boolean checkForCommas(String numbers) {
        boolean value = false;
        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) == ',') {
                return true;
            }
        }
        return value;
    }

    public static int[] parseStringToIntArray(String numbers) {
        return stringArrayToIntArray(numbers.split(","));
    }

    public static int[] stringArrayToIntArray(String[] array) {
        int[] ints = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ints[i] = Integer.parseInt(array[i]);
        }
        return ints;
    }

    public static int addNumbersUpFromIntArray(int[] ints) {
        int value = 0;
        for (int i : ints) {
            value += i;
        }
        return value;
    }
}

