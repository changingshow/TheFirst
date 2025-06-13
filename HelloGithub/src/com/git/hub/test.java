package com.git.hub;

public class test {

        /**
         * Sorts an integer array using the bubble sort algorithm.
         *
         * @param arr array to be sorted in ascending order
         */
        public static void bubbleSort(int[] arr) {
                for (int i = 0; i < arr.length - 1; i++) {
                        for (int j = 0; j < arr.length - 1 - i; j++) {
                                if (arr[j] > arr[j + 1]) {
                                        int temp = arr[j];
                                        arr[j] = arr[j + 1];
                                        arr[j + 1] = temp;
                                }
                        }
                }
        }

        public static void main(String[] args) {
                int[] arr;
                if (args.length == 0) {
                        arr = new int[] {5, 2, 8, 3, 1};
                } else {
                        arr = new int[args.length];
                        for (int i = 0; i < args.length; i++) {
                                arr[i] = Integer.parseInt(args[i]);
                        }
                }

                bubbleSort(arr);

                for (int num : arr) {
                        System.out.print(num + " ");
                }
                System.out.println();
        }

}
