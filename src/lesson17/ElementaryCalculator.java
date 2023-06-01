package lesson17;

public class ElementaryCalculator {

    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int divide2Nums(){
        int divideResults = -1;

        try{
            divideResults = this.num1/this.num2;
        } catch (Exception e){
            //throw new Error(e.toString()); //nếu throw type Error ở đây thì bên dưới kia phải catch type Error
            throw new ArithmeticException(e.toString()); //nếu throw type Exception ở đây thì bên dưới kia phải catch type Exception
        }

        return divideResults;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        int divideResult = 0;

        try{
            divideResult = a/b;
            System.out.println("Your result is: ");
            System.out.println(divideResult);
        } catch(Exception exception){
            System.out.println("You input an invalid number!");
        }

        System.out.println("Continuing code here");

        //-----------------------------------------------

        int num1 = 1;
        int num2 = 0;
        boolean hasError = false;
        String errMsg = "";
        int divideResult2Nums = -1;

        ElementaryCalculator elementaryCalculator = new ElementaryCalculator();
        elementaryCalculator.setNum1(num1);
        elementaryCalculator.setNum2(num2);

        try{
            divideResult2Nums = elementaryCalculator.divide2Nums();
        } catch (Exception e) { //này phải giống type là Error giống với type Error trong hàm divide2Nums - có thể test lại case na bằng cách đổi type Error thành Exception
            //khi type Exception thì lúc này nó sẽ throw lỗi và ngừng run những đoạn code đằng dưới.
            System.out.println("Error has happended");
            hasError = true;
            errMsg = e.toString(); // cho nay thuc hien xong vi ko con lenh nao trong nhom nay nen nó throw error xong là nó dừng luôn
        }

        if(hasError) System.out.println("[ERR] " + errMsg);
        else System.out.println("Your result is %d " + divideResult2Nums);

    }
}
