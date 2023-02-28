import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Input = new Scanner(System.in);
        Boolean ReshowMainMenu;
        do {
            ReshowMainMenu = false;
            // Main Menu
            System.out.println(
                    "\nMAIN MENU\n===============================================\nWhat do you need to implement ?");
            System.out.println("\t1.Encyption\n\t2.Hashing\n\t3.Exit");
            System.out.print("Enter your Choice:");
            int Selector = Input.nextInt();

            switch (Selector) {
                case 1: // Encryption case
                    boolean ReshowEncryptionMenu;
                    int SelectorCase1;
                    do { // Case 1
                        System.out.println(
                                "\nENCRYPTION\n===============================================\nWhat do you need to implement ?");
                        System.out.println("\t1.Encrypt\n\t2.Decrypt\n\t3.Back to main menu");
                        System.out.print("Enter your Choice:");
                        SelectorCase1 = Input.nextInt();
                        ReshowEncryptionMenu = false;
                        switch (SelectorCase1) {
                            case 1: // Encrypt
                                File inputFileToEncrypt = chooseFile();
                                String encryptAlgorithm = algorithmChooser();
                                String encryptKey = key(encryptAlgorithm);
                                cryptography(encryptAlgorithm, 1, encryptKey, inputFileToEncrypt.getAbsolutePath());
                                break;
                            case 2: // Decrypt
                                File inputFileToDecrypt = chooseFile();
                                String decryptAlgorithm = algorithmChooser();
                                String decryptKey = key(decryptAlgorithm);
                                cryptography(decryptAlgorithm, 2, decryptKey, inputFileToDecrypt.getAbsolutePath());
                                break;
                            case 3: // back to main menu
                                ReshowEncryptionMenu = false; // Back to main menu
                                ReshowMainMenu = true;
                                break;
                            default:
                                System.out.println("\nError : please enter the correct number (only)!");
                                ReshowEncryptionMenu = true;
                        }
                    } while (ReshowEncryptionMenu);
                    break;
                case 2: // Hash Case
                    File inputFile = chooseFile();
                    String algorithm = algorithmHashChooser();
                    Hashing(algorithm, inputFile.getAbsolutePath());
                    break;
                case 3: // exit from main menu
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nError : please enter the correct number (only)!");
                    ReshowMainMenu = true;
            }
        } while (ReshowMainMenu);
    }

    private static File chooseFile() {
        Scanner Input = new Scanner(System.in);
        File file = null;
        ;
        boolean rechooseFile;
        do {
            rechooseFile = false;
            System.out.print("Choose your file:");
            String url = Input.nextLine();
            System.out.print("\nyour file is : " + url + "\n are you sure [y,n] :");
            char sure = Input.next().charAt(0);
            Input.nextLine(); // Consume rest of the line
            if (sure == 'n' || sure == 'N') {
                rechooseFile = true;
                continue;
            }

            file = new File(url);
            if (!file.exists()) {
                System.out.println("Error: File Dose not exists!");
                rechooseFile = true;
            }

        } while (rechooseFile);
        return file;
    }

    private static String algorithmChooser() {
        Scanner Input = new Scanner(System.in);
        String algorithm = null;
        boolean rechooseAlgorithm;
        do {
            rechooseAlgorithm = false;
            System.out.print("Choose the algorithm (AES, DES): ");
            algorithm = Input.next();
            if (!algorithm.toUpperCase().matches("AES|DES")) {
                rechooseAlgorithm = true;
                System.out.println("Error: Enter one of the algorithms!");
            }
        } while (rechooseAlgorithm);
        return algorithm.toUpperCase();
    }

    private static String key(String algorithm) {
        Scanner Input = new Scanner(System.in);
        String key = null;
        int keyLength = 0;
        boolean rechooseKey;

        if (algorithm.matches("DES")) {
            keyLength = 8;
        } else if (algorithm.matches("AES")) {
            keyLength = 24;
        }
        do {
            rechooseKey = false;
            System.out.print("Enter the secret key (" + keyLength + "-length) :");
            key = Input.nextLine();
            if (key.length() != keyLength) {
                rechooseKey = true;
                System.out.println("Error: Enter " + keyLength + " length size key!");
            }
        } while (rechooseKey);
        return key;
    }

    private static void cryptography(String algorithm, int mode, String key, String url) throws Exception {
        String outputPath = null;
        String modeString = null;
        if (algorithm.matches("DES")) {
            DES des = new DES(key, url);
            switch (mode) {
                case 1:
                    des.encryption();
                    modeString = "encrypted";
                    break;
                case 2:
                    des.decryption();
                    modeString = "decrypted";
                    break;
            }
            outputPath = des.getOut();
        } else if (algorithm.matches("AES")) {
            AES aes = new AES(key, url);
            switch (mode) {
                case 1:
                    aes.encryption();
                    modeString = "encrypted";
                    break;
                case 2:
                    aes.decryption();
                    modeString = "decrypted";
                    break;
            }
            outputPath = aes.getOut();
        }
        System.out.println(
                "Done! File " + url + " is " + modeString + " using " + algorithm + "\nOutput file is " + outputPath);
    }

    private static String algorithmHashChooser() {
        Scanner Input = new Scanner(System.in);
        String algorithm = null;
        boolean rechooseAlgorithm;
        do {
            rechooseAlgorithm = false;
            System.out.print("Choose the Algorithm (SHA256, SHA512): ");
            algorithm = Input.next();
            if (!algorithm.toUpperCase().matches("SHA256|SHA512")) {
                rechooseAlgorithm = true;
                System.out.println("Error: Enter one of the algorithms!");
            }
        } while (rechooseAlgorithm);
        return algorithm.toUpperCase();
    }

    private static void Hashing(String algorithm, String url) throws Exception {
        Hash hash = new Hash(url);
        if (algorithm.matches("SHA256")) {
            hash.SHA256();
        } else if (algorithm.matches("SHA512")) {
            hash.SHA512();
        }
        System.out.println("Done! File " + url + " digested using " + algorithm + "\nOutput file is " + hash.getOut());
    }
}