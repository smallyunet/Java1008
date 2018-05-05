/*
 * 英才科技 版权所有
 */

/**
 * Task9
 * 契波那契数列前40项
 * 
 * @author smallyu
 * @version 1.0
 */
public class Task9 {
    public static void main(String[] args) {
        int[] list = new int[40]; 
        list[0] = 1;
        list[1] = 1;
        for(int i = 1; i < 39; i++) {
            list[i + 1] = list[i] + list[i - 1];
        }
        for(int i : list){
            System.out.println(i);
        }
    }
}