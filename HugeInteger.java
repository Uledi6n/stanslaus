import java.util.Arrays;

public class HugeInteger {
    private int[] digits = new int[40];

    // Input: Stores a number as an array of digits
    public void input(String number) {
        Arrays.fill(digits, 0); // Clear the array
        int len = number.length();
        if (len > 40) throw new IllegalArgumentException("Number exceeds 40 digits");
        for (int i = 0; i < len; i++) {
            digits[40 - len + i] = number.charAt(i) - '0'; // Store each digit
        }
    }

    // Output: Returns the number as a String
    public String output() {
        StringBuilder result = new StringBuilder();
        boolean leadingZero = true;
        for (int digit : digits) {
            if (digit != 0) leadingZero = false;
            if (!leadingZero) result.append(digit);
        }
        return leadingZero ? "0" : result.toString();
    }

    // Add two HugeIntegers
    public HugeInteger add(HugeInteger other) {
        HugeInteger result = new HugeInteger();
        int carry = 0;
        for (int i = 39; i >= 0; i--) {
            int sum = this.digits[i] + other.digits[i] + carry;
            result.digits[i] = sum % 10;
            carry = sum / 10;
        }
        return result;
    }

    // Subtract another HugeInteger
    public HugeInteger subtract(HugeInteger other) {
        if (this.isLessThan(other)) throw new IllegalArgumentException("Result would be negative");
        HugeInteger result = new HugeInteger();
        int borrow = 0;
        for (int i = 39; i >= 0; i--) {
            int diff = this.digits[i] - other.digits[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.digits[i] = diff;
        }
        return result;
    }

    // Predicate: Is the number zero?
    public boolean isZero() {
        for (int digit : digits) if (digit != 0) return false;
        return true;
    }

    // Predicate: Is equal to another HugeInteger?
    public boolean isEqualTo(HugeInteger other) {
        return Arrays.equals(this.digits, other.digits);
    }

    // Predicate: Is not equal to another HugeInteger?
    public boolean isNotEqualTo(HugeInteger other) {
        return !this.isEqualTo(other);
    }

    // Predicate: Is greater than another HugeInteger?
    public boolean isGreaterThan(HugeInteger other) {
        for (int i = 0; i < 40; i++) {
            if (this.digits[i] > other.digits[i]) return true;
            if (this.digits[i] < other.digits[i]) return false;
        }
        return false;
    }

    // Predicate: Is less than another HugeInteger?
    public boolean isLessThan(HugeInteger other) {
        return other.isGreaterThan(this);
    }

    // Predicate: Is greater than or equal to another HugeInteger?
    public boolean isGreaterThanOrEqualTo(HugeInteger other) {
        return !this.isLessThan(other);
    }

    // Predicate: Is less than or equal to another HugeInteger?
    public boolean isLessThanOrEqualTo(HugeInteger other) {
        return !this.isGreaterThan(other);
    }

    // Main method for testing
    public static void main(String[] args) {
        HugeInteger num1 = new HugeInteger();
        HugeInteger num2 = new HugeInteger();
        
        num1.input("1234567890123456789012345678901234567890");
        num2.input("987654321098765432109876543210987654321");
        
        System.out.println("Num1: " + num1.output());
        System.out.println("Num2: " + num2.output());
        
        HugeInteger sum = num1.add(num2);
        System.out.println("Sum: " + sum.output());
        
        HugeInteger diff = num1.subtract(num2);
        System.out.println("Difference: " + diff.output());
        
        System.out.println("Is Num1 Zero? " + num1.isZero());
        System.out.println("Is Num1 Equal to Num2? " + num1.isEqualTo(num2));
        System.out.println("Is Num1 Greater than Num2? " + num1.isGreaterThan(num2));
        System.out.println("Is Num1 Less than Num2? " + num1.isLessThan(num2));
    }
}
