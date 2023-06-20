package com.apm.insight.runtime;

import android.text.TextUtils;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private static File f6655a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f6656a;

        /* renamed from: b  reason: collision with root package name */
        public String f6657b;

        /* renamed from: c  reason: collision with root package name */
        public long f6658c;

        a(String str) {
            String[] split = str.split("\\s+");
            if (split.length != 3) {
                com.apm.insight.c a10 = com.apm.insight.b.a();
                a10.a("NPTH_CATCH", new RuntimeException("err ProcessTrack line:" + str));
                return;
            }
            this.f6656a = split[0];
            this.f6657b = split[1];
            try {
                this.f6658c = Long.parseLong(split[2]);
            } catch (Throwable th) {
                com.apm.insight.c a11 = com.apm.insight.b.a();
                a11.a("NPTH_CATCH", new RuntimeException("err ProcessTrack line:" + str, th));
            }
        }
    }

    private static File a() {
        if (f6655a == null) {
            String c10 = com.apm.insight.l.a.c(com.apm.insight.h.g());
            if (c10 == null) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String j10 = com.apm.insight.l.o.j(com.apm.insight.h.g());
            f6655a = new File(j10, "apminsight/ProcessTrack/" + ((currentTimeMillis - (currentTimeMillis % 86400000)) / 86400000) + '/' + c10.replace(':', '_') + Constants.DEFAULT_DL_TEXT_EXTENSION);
        }
        return f6655a;
    }

    public static File a(long j10) {
        String j11 = com.apm.insight.l.o.j(com.apm.insight.h.g());
        return new File(j11, "apminsight/ProcessTrack/" + ((j10 - (j10 % 86400000)) / 86400000));
    }

    public static HashMap<String, a> a(long j10, String str) {
        File file = new File(com.apm.insight.l.o.j(com.apm.insight.h.g()), "apminsight/ProcessTrack/" + ((j10 - (j10 % 86400000)) / 86400000));
        String[] list = file.list();
        HashMap<String, a> hashMap = new HashMap<>();
        if (list != null) {
            for (String str2 : list) {
                File file2 = new File(file, str2);
                long length = file2.length();
                try {
                    JSONArray a10 = com.apm.insight.l.i.a(file2, length > 1048576 ? length - 524288 : 0L);
                    int length2 = a10.length() - 1;
                    while (true) {
                        if (length2 >= 0) {
                            String optString = a10.optString(length2);
                            if (!TextUtils.isEmpty(optString) && optString.startsWith(str)) {
                                hashMap.put(str2.replace('_', ':').replace(Constants.DEFAULT_DL_TEXT_EXTENSION, ""), new a(optString));
                                break;
                            }
                            length2--;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
        return hashMap;
    }

    public static void a(String str, String str2) {
        try {
            File a10 = a();
            if (a10 != null) {
                com.apm.insight.l.i.a(a10, str + ' ' + str2 + ' ' + System.currentTimeMillis() + '\n', true);
            }
        } catch (Throwable unused) {
        }
    }
}
