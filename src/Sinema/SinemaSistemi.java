import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinemaSistemi {

    static class Film {
        String ad;
        String sure;
        String tur;

        public Film(String ad, String sure, String tur) {
            this.ad = ad;
            this.sure = sure;
            this.tur = tur;
        }

        public String getAd() {
            return ad;
        }

        @Override
        public String toString() {
            return "Film: " + ad + " | Süre: " + sure + " | Tür: " + tur;
        }
    }

    static class Musteri {
        String ad;
        String email;
        List<Film> biletler;

        public Musteri(String ad, String email) {
            this.ad = ad;
            this.email = email;
            this.biletler = new ArrayList<>();
        }

        public void biletEkle(Film film) {
            this.biletler.add(film);
        }

        @Override
        public String toString() {
            return "Müşteri: " + ad + " | Email: " + email;
        }
    }

    static List<Film> filmler = new ArrayList<>();
    static List<Musteri> musteriler = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSinema Sistemi");
            System.out.println("1) Film Ekle");
            System.out.println("2) Müşteri Ekle");
            System.out.println("3) Bilet Kaydet");
            System.out.println("4) Biletleri Listele");
            System.out.println("5) Çıkış");
            System.out.print("Seçiminiz: ");

            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    filmEkle(scanner);
                    break;
                case 2:
                    musteriEkle(scanner);
                    break;
                case 3:
                    biletKaydet(scanner);
                    break;
                case 4:
                    biletleriListele();
                    break;
                case 5:
                    System.out.println("Çıkılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçim yaptınız.");
            }
        }
    }

    static void filmEkle(Scanner scanner) {
        System.out.print("Film adı: ");
        String ad = scanner.nextLine();
        System.out.print("Süre: ");
        String sure = scanner.nextLine();
        System.out.print("Tür: ");
        String tur = scanner.nextLine();

        filmler.add(new Film(ad, sure, tur));
        System.out.println("Film eklendi.");
    }

    static void musteriEkle(Scanner scanner) {
        System.out.print("Müşteri adı: ");
        String ad = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        musteriler.add(new Musteri(ad, email));
        System.out.println("Müşteri eklendi.");
    }

    static void biletKaydet(Scanner scanner) {
        if (musteriler.isEmpty() || filmler.isEmpty()) {
            System.out.println("Önce müşteri ve film ekleyiniz.");
            return;
        }

        System.out.print("Müşteri numarası (1 - " + musteriler.size() + "): ");
        int musteriIndex = scanner.nextInt() - 1; // Kullanıcının girdiği numaradan 1 çıkarıyoruz
        System.out.print("Film numarası (1 - " + filmler.size() + "): ");
        int filmIndex = scanner.nextInt() - 1; // Kullanıcının girdiği numaradan 1 çıkarıyoruz
        scanner.nextLine();

        if (musteriIndex < 0 || musteriIndex >= musteriler.size() || filmIndex < 0 || filmIndex >= filmler.size()) {
            System.out.println("Geçersiz seçim yaptınız.");
            return;
        }

        Musteri musteri = musteriler.get(musteriIndex);
        Film film = filmler.get(filmIndex);
        musteri.biletEkle(film);
        System.out.println("Bilet kaydedildi.");
    }

    static void biletleriListele() {
        for (Musteri musteri : musteriler) {
            System.out.println("\n" + musteri);
            System.out.print("Biletler: ");
            if (musteri.biletler.isEmpty()) {
                System.out.println("Yok.");
            } else {
                for (Film film : musteri.biletler) {
                    System.out.print(film.getAd() + " , ");
                }
                System.out.println();
            }
        }
    }
}