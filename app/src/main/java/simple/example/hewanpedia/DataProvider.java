package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Buaya;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing(ctx.getString(R.string.angora_nama), ctx.getString(R.string.angora_asal),
                ctx.getString(R.string.angora_deskripsi), R.drawable.cat_angora));
        kucings.add(new Kucing(ctx.getString(R.string.bengal_nama), ctx.getString( R.string.bengal_asal),
                ctx.getString(R.string.bengal_deskripsi),R.drawable.cat_bengal));
        kucings.add(new Kucing(ctx.getString(R.string.birmani_nama), ctx.getString(R.string.birmani_asal),
                ctx.getString(R.string.birmani_deskripsi), R.drawable.cat_birman));
        kucings.add(new Kucing(ctx.getString(R.string.persia_nama), ctx.getString(R.string.persia_asal),
                ctx.getString(R.string.persia_deskripsi), R.drawable.cat_persia));
        kucings.add(new Kucing(ctx.getString(R.string.siam_nama), ctx.getString(R.string.siam_asal),
                ctx.getString(R.string.siam_deskripsi), R.drawable.cat_siam));
        kucings.add(new Kucing(ctx.getString(R.string.siberia_nama), ctx.getString(R.string.siberia_asal),
                ctx.getString(R.string.siberia_deskripsi), R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing(ctx.getString(R.string.bulldog_nama), ctx.getString(R.string.bulldog_asal),
                ctx.getString(R.string.bulldog_deskripsi), R.drawable.dog_bulldog));
        anjings.add(new Anjing(ctx.getString(R.string.husky_nama), ctx.getString(R.string.husky_asal),
                ctx.getString(R.string.husky_deskripsi), R.drawable.dog_husky));
        anjings.add(new Anjing(ctx.getString(R.string.kintamani_nama), ctx.getString(R.string.kintamani_asal),
                ctx.getString(R.string.kintamani_deskripsi), R.drawable.dog_kintamani));
        anjings.add(new Anjing(ctx.getString(R.string.samoyed_nama), ctx.getString(R.string.samoyed_asal),
                ctx.getString(R.string.samoyed_deskripsi), R.drawable.dog_samoyed));
        anjings.add(new Anjing(ctx.getString(R.string.shepherd_nama), ctx.getString(R.string.shepherd_asal),
                ctx.getString(R.string.shepherd_deskripsi), R.drawable.dog_shepherd));
        anjings.add(new Anjing(ctx.getString(R.string.shiba_nama), ctx.getString(R.string.shiba_asal),
                ctx.getString(R.string.shiba_deskripsi), R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Buaya>initDataBuaya(Context ctx) {
        List<Buaya> buayas = new ArrayList<>();
        buayas.add(new Buaya(ctx.getString(R.string.nil_nama),ctx.getString(R.string.nil_asal),
                 ctx.getString(R.string.bulldog_deskripsi),R.drawable.nil));
        buayas.add(new Buaya(ctx.getString(R.string.asin_nama), ctx.getString(R.string.asin_asal),
                ctx.getString(R.string.asin_deskripsi), R.drawable.air_asin));
        buayas.add(new Buaya(ctx.getString(R.string.alligator_nama), ctx.getString(R.string.alligator_asal),
                ctx.getString(R.string.Alligator_deskripsi), R.drawable.aligator));
        buayas.add(new Buaya(ctx.getString(R.string.Gharial_nama), ctx.getString(R.string.Gharial_asal),
                ctx.getString(R.string.Gharial_deskripsi) , R.drawable.gharial));
        buayas.add(new Buaya(ctx.getString(R.string.Hitam_nama), ctx.getString(R.string.Hitam_asal),
                ctx.getString(R.string.Hitam_deskripsi) , R.drawable.caimam_hitam));
        buayas.add(new Buaya(ctx.getString(R.string.Putih_nama), ctx.getString(R.string.Putih_asal),
                ctx.getString(R.string.Putih_deskripsi) , R.drawable.buayaputih));
        return buayas;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataBuaya(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
