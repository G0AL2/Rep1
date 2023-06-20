package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* compiled from: DataFetchProducer.java */
/* loaded from: classes.dex */
public class m extends e0 {
    public m(b4.h hVar) {
        super(w3.a.a(), hVar);
    }

    static byte[] g(String str) {
        y3.k.b(Boolean.valueOf(str.substring(0, 5).equals("data:")));
        int indexOf = str.indexOf(44);
        String substring = str.substring(indexOf + 1, str.length());
        if (h(str.substring(0, indexOf))) {
            return Base64.decode(substring, 0);
        }
        String decode = Uri.decode(substring);
        y3.k.g(decode);
        return decode.getBytes();
    }

    static boolean h(String str) {
        if (str.contains(";")) {
            String[] split = str.split(";");
            return split[split.length - 1].equals("base64");
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected w5.e d(b6.b bVar) throws IOException {
        byte[] g10 = g(bVar.q().toString());
        return c(new ByteArrayInputStream(g10), g10.length);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected String f() {
        return "DataFetchProducer";
    }
}
