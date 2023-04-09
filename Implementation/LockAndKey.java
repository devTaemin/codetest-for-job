//class Solution {
//    
//    public int[][] rotateKey(int[][] key) {
//        int rowLen = key.length;
//        int colLen = key[0].length;
//        int[][] result = new int[rowLen][colLen];
//        
//        for (int row = 0; row < rowLen; row++) {
//            for (int col = 0; col < colLen; col++) {
//                result[col][colLen - 1 - row] = key[row][col];
//            }
//        }
//        return result;
//    }
//    
//    public boolean checkResult(int[][] newLock) {
//        int N = newLock.length / 3;
//        for (int row = N; row < 2 * N; row++) {
//            for (int col = N; col < 2 * N; col++) {
//                if (newLock[row][col] != 1) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//    
//    
//    public boolean solution(int[][] key, int[][] lock) {
//        int M = key.length;
//        int N = lock.length;
//        
//        int[][] newLock = new int[N * 3][N * 3];
//        for (int row = 0; row < N; row++) {
//            for (int col = 0; col < N; col++) {
//                newLock[row + N][col + N] = lock[row][col];
//            }
//        }
//        
//        int[][] rotatedKey = key;
//        for (int rotation = 0; rotation < 4; rotation++) {
//            rotatedKey = rotateKey(rotatedKey);
//            
//            for (int startX = 0; startX < 2 * N; startX++) {
//                for (int startY = 0; startY < 2 * N; startY++) {
//                    
//                    // Use Key
//                    for (int keyX = 0; keyX < M; keyX++) {
//                        for (int keyY = 0; keyY < M; keyY++) {
//                            newLock[startX + keyX][startY + keyY] += rotatedKey[keyX][keyY];
//                        }
//                    }
//                    
//                    // Check Result
//                    if (checkResult(newLock)) return true;
//                    
//                    // Remove Key
//                    for (int keyX = 0; keyX < M; keyX++) {
//                        for (int keyY = 0; keyY < M; keyY++) {
//                            newLock[startX + keyX][startY + keyY] -= rotatedKey[keyX][keyY];
//                        }
//                    }
//                }
//            }
//        }
//        
//        
//        return false;
//    }
//}