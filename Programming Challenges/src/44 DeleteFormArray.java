import java.util.Scanner;

class DeleteFormArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Deletion\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Now, enter number you want to delete: ");
        int numTODelete = input.nextInt();
        int[] newArr = deleteNumber(numArr, numTODelete);
        System.out.println("Here is your new Array");
        ArrayUtility.displayArray(newArr);

    }

    public static int[] deleteNumber(int[] numArr, int numToDelete) {
        int occ = OccurrenceArray.noOfOccurrences(numArr, numToDelete);
        if (occ == 0) {
            return numArr;
        }
        int newsize = numArr.length - occ;
        int[] newArr = new int[newsize];

        int i = 0, j= 0;
        while (i < numArr.length) {
            if (numArr[i] != numToDelete) {
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }

        return newArr;
    }
}
