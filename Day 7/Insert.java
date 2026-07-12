public class Insert{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        sb.insert(2, 'n');
        System.out.println(sb);

        // del the extra 'n'
        sb.delete(2, 3);
        System.out.println(sb);     // toy == (2, 4)
    }
}
