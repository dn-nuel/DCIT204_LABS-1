public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size please :   ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();
        System.out.println();

        int linearIndex = Algorithm.linearSearch(array, target);

        System.out.println("Linear Search Result:");
        if (linearIndex != -1) {
            System.out.println("Target found at index " + linearIndex);
        } else {
            System.out.println("Target not found in the array.");
        }

        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        int binaryIndex = Algorithm.binarySearch(sortedArray, target);

        System.out.println();
        System.out.println("Binary Search Result:");
        System.out.println("(Array sorted before searching: " + Arrays.toString(sortedArray) + ")");
        if (binaryIndex != -1) {
            System.out.println("Target found at indexx " + binaryIndex);
        } else {
            System.out.println("Target not found in the array.");
        }

        scanner.close();
    }
}
    
