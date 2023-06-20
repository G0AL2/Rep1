package ms.bd.o.Pgl;

import android.content.res.AssetManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import ms.bd.o.Pgl.pblb;

/* loaded from: classes3.dex */
final class pblg extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    protected Object a(int i10, long j10, String str, Object obj) throws Throwable {
        InputStream inputStream;
        IOException e10;
        FileOutputStream fileOutputStream;
        AssetManager assets = pgla.a().b().getAssets();
        if (!str.startsWith((String) pblk.a(16777217, 0, 0L, "df24d3", new byte[]{59}))) {
            str = ((String) pblk.a(16777217, 0, 0L, "6af8e7", new byte[]{105})) + str;
        }
        String[] list = assets.list("");
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.length; i11++) {
            if (list[i11].endsWith(str)) {
                String str2 = list[i11];
                String absolutePath = File.createTempFile((String) pblk.a(16777217, 0, 0L, "34dbd5", new byte[]{47, 37, 18, 14, 79}), "").getAbsolutePath();
                FileOutputStream fileOutputStream2 = null;
                try {
                    inputStream = assets.open(str2);
                } catch (IOException e11) {
                    e10 = e11;
                    inputStream = null;
                } catch (Throwable th) {
                    th = th;
                    inputStream = null;
                }
                try {
                    try {
                        fileOutputStream = new FileOutputStream(absolutePath);
                        try {
                            if (pblz.a(inputStream, fileOutputStream) > 0) {
                                arrayList.add(absolutePath);
                            }
                        } catch (IOException e12) {
                            e10 = e12;
                            fileOutputStream2 = fileOutputStream;
                            e10.printStackTrace();
                            fileOutputStream = fileOutputStream2;
                            pblz.a(inputStream);
                            pblz.a(fileOutputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream2 = fileOutputStream;
                            pblz.a(inputStream);
                            pblz.a(fileOutputStream2);
                            throw th;
                        }
                    } catch (IOException e13) {
                        e10 = e13;
                    }
                    pblz.a(inputStream);
                    pblz.a(fileOutputStream);
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        return arrayList.toArray(new String[0]);
    }
}
