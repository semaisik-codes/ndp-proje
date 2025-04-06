# ndp-proje
Main Sistemi

Bu proje, basit bir sinema bilet yönetim sistemi olarak geliştirilmiştir. Kullanıcılar sinemada gösterilen filmleri ekleyebilir, müşterileri kaydedebilir ve bilet satabilirler. Sistem her müşterinin aldığı biletleri yönetir ve görüntüler.

Film Sınıfı (Film)

Sinemada gösterilen filmlerle ilgili bilgileri tutar ve bunu düzenli bir şekilde saklar. String ad filmin adını belirleyen, string sure filmin süresini belirleyen, string tur filmin türünü belirler.
getAd kullanarak filmin adını döndürmesini sağladım. toString ile de filmi temsil eden ad, süre ve tür bilgilerini döndürmesini sağladım.

Müşteri Sınıfı (Musteri)

Müşteri sınıfı, sinema biletlerini satın alacak kişilerin bilgilerini tutar. String ad, string email, List<Film>biletler. Bu, sistemin her müşterinin hangi filmi izlediğini takip etmesini sağlar.

Film ve Müşteri Listeleri (filmler ve musteriler)

Bu iki liste sırasıyla sistemdeki tüm filmleri ve tüm müşterileri saklamak için kullanılır. Film eklemek için filmler listesine yeni filmler eklenir. Müşteri eklemek için de musteriler listesine yeni müşteriler eklenir. Bilet kaydetme işlemi yapıldığında ilgili film ve müşteri bilgileri bu listelerden alınır ve ilişkilendirilir.

Ana Menü ve Kullanıcı Seçimleri

Kullanıcıya menü seçenekleri sunar ve kullanıcının seçim yapmasına olanak tanır. Film ekle, müşteri ekle, bilet kaydet, biletleri listele ve çıkış.

Bilet Kaydetme İşlemi (biletKaydet() )

Bir müşterinin film satın almasını sağlar. Film ve müşteri bilgileri, kullanıcı tarafından seçildikten sonra ilişkilendirilir ve müşteriyi bilet listesine ekler.

Bilet Listeleme İşlemi (biletleriListele() )

Tüm müşterilerin satıl aldığı biletleri görüntüler. Eğer hiçbir müşteri bilet almadıysa, "Satın alınmış bilet yok." mesajı görüntülenir.

Kullanılan Yapılar

class yapısı film ve müşteri nesnelerini modellemek için, List (ArrayList) yapısını film ve müşteri listelerini tutmak için, scanner yapısını kullanıcıdan konsoldan giriş almak için, switch-case yapısını menüde kullanıcının seçimlerine göre işlem yapmak için, for each döngüsünü de müşterilerin biletlerini listelemek amacıyla kullandım.
