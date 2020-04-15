package percabangan;

public class Switch {
    public static void main(String[] args) {
//        int jalanan=3;
//        switch (jalanan){
//            case 1:
//                System.out.println("cuci mata");
//                break;
//            case  2:
//                System.out.println("cari udara");
//                break;
//           case 3:
//                System.out.println("beli mamam");
//                break;
//            case 4:
//                System.out.println("bt dirumah");
//                break;
//            default:
//                System.out.println("hantu dkk");
//                break;
//        }
          char nilai = 'D';
          switch (nilai){
              case 'A':
                  System.out.println("Mhs   :\"terimakasih pak! \"");
                  System.out.println("Dosen :\"selamat ya nak.\"");
                  break;
              case 'B':
                  System.out.println("Mhs   : \"kenapa nilai saya seperti ini pak?\"");
                  System.out.println("Dosen : \"suka-suka ajassih...\"");
                  break;
              case 'C':
                  System.out.println("Mhs   : \"tugas dan absen saya full, pak.\"");
                  System.out.println("Dosen :\"o aja y kaaan... \"");
                  break;
              default:
                  System.out.println("Mhs   :\"tugas serta absen saya full, pak. mohon dicek\"");
                  System.out.println("Dosen :\"saya g nanya tuch, hmppff!\"");
                  break;
          }
    }
}
