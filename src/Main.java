public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //  1. Collecting array size 
        System.out.print("Enter array size please: ");
        int size = scanner.nextInt();

        //  2. Collecting array elements 
        int[] array = new int[size];
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        //3. Collecting target value 
        System.out.println();
        System.out.print("Enter target value: ");
        int target = scanner.nextInt();
        System.out.println();

        // ── 4. Linear Search for unsorted araay
        int linearIndex = Algorithm.linearSearch(array, target);

        System.out.println("Linear Search Result:");
        if (linearIndex != -1) {
            System.out.println("Target found at index " + linearIndex);
        } else {
            System.out.println("Target not foundd in the array.");
        }

        // 5. Binary Search using a sorted array
        
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        int binaryIndex = Algorithm.binarySearch(sortedArray, target);

        System.out.println();
        System.out.println("Binary Search Result:");
        System.out.println("(Array sorted before searching: " + Arrays.toString(sortedArray) + ")");
        if (binaryIndex != -1) {
            System.out.println("Target found at index " + binaryIndex);
        } else {
            System.out.println("Target not found in the array.");
        }

        scanner.close();
    
    }
}
