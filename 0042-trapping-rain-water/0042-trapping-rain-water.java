class Solution {
    public int trap(int[] height) {
     if (height == null || height.length == 0) {
                    return 0;
                            }

                                    int n = height.length;
                                            int[] lb = new int[n]; // Left boundary max
                                                    int[] rb = new int[n]; // Right boundary max

                                                            // Fill lb array
                                                                    lb[0] = height[0];
                                                                            for (int i = 1; i < n; i++) {
                                                                                        lb[i] = Math.max(lb[i - 1], height[i]);
                                                                                                }

                                                                                                        // Fill rb array
                                                                                                                rb[n - 1] = height[n - 1];
                                                                                                                        for (int i = n - 2; i >= 0; i--) {
                                                                                                                                    rb[i] = Math.max(rb[i + 1], height[i]);
                                                                                                                                            }

                                                                                                                                                    // Calculate trapped water
                                                                                                                                                            int waterTrapped = 0;
                                                                                                                                                                    for (int i = 0; i < n; i++) {
                                                                                                                                                                                waterTrapped += Math.min(lb[i], rb[i]) - height[i];
                                                                                                                                                                                        }

                                                                                                                                                                                                return waterTrapped;
     }

          

        
    }
