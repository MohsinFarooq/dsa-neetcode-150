class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Deque<Double> stack = new ArrayDeque<>();
        int n = position.length;
        int[][] sortedCars = new int[n][2];
        double[] timeOfArrivalForEachCar = new double[n];

        for(int i = 0; i < n; i++) {
            sortedCars[i][0] = position[i];
            sortedCars[i][1] = speed[i];
        }
        Arrays.sort(sortedCars, (a, b) -> Integer.compare(b[0], a[0]));

        for(int i = 0; i < sortedCars.length; i++) {
            timeOfArrivalForEachCar[i] = (target - sortedCars[i][0]) / (double)sortedCars[i][1];

        }

        for(int i = 0; i < timeOfArrivalForEachCar.length; i++) {
            double currentTime = timeOfArrivalForEachCar[i];
            if(stack.isEmpty() || currentTime > stack.peek()) {
    stack.push(currentTime);
}
        }

        return stack.size();



        
    }
}
