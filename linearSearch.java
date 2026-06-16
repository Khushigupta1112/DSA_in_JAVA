public class linearSearch {
        public static void main(String[] args) {
            int[] nums = {23,33,19,78,45,9};
            int target = 23;
            int ans = linearSearching( nums ,  target);
            System.out.print(ans);

        }

        static int linearSearching(int[] arr, int target){
            if(arr.length == 0){
                return -1;
            }
            for(int index = 0; index < arr.length; index++){
                int element = arr[index];
                if(element == target){
                    return index;

                }
            }

            return -1;
        }

    }

