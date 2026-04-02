// 7. Define a class TextEditorBuffer.
// •	Create a string using StringBuffer. 
// •	Append text to the string. 
// •	Insert text at a specific position. 
// •	Reverse the final string and display it. 

class TextEditorBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        sb.insert(5, " Java");

        System.out.println("Modified: " + sb);

        sb.reverse();
        System.out.println("Reversed: " + sb);
    }
}