public class StringRotate {
    public static void main(String[] args) {
        String str1 = "cloudtech";
        String str2 = "techcloud";

        str1 = str1 + str1; // cloudtechcloudtech
        if (str1.indexOf(str2) != -1) {
            System.out.println("String is rotationsl");
        } else
            System.out.println("String is no rotational");

    }
}
