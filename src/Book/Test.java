/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

/**
 *
 * @author cung.nguyen
 */
public class Test {
    public static int find(int array[]){
        int result = 0;
        int temp;
        // Vòng for sắp xếp theo thứ tự nhỏ tới lớn theo phương pháp nổi bọt
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }

        int dem = array.length;
        return array[dem - 2];
    }
    
    public static int checkUndup(int a[], int b[]){
        int result[];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        
                    }
                }
            }
        return result[];
    }
    
    public static void main(String[] args) {
        int a[] = { 33, 3, 4, 5};
        int b[] = { 33, 5, 6, 7};
        System.out.println("Gia tri lon thu hai trong mang la: " +find(a));
        System.out.println("Những phần tử không trùng lặp là: " );
    }
}
