package com.apm.insight.runtime;

import android.content.Context;
import com.apm.insight.entity.Header;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private static s f6659a;

    /* renamed from: b  reason: collision with root package name */
    private File f6660b;

    /* renamed from: c  reason: collision with root package name */
    private File f6661c;

    /* renamed from: d  reason: collision with root package name */
    private File f6662d;

    /* renamed from: e  reason: collision with root package name */
    private Context f6663e;

    /* renamed from: f  reason: collision with root package name */
    private a f6664f = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private long f6667a;

        /* renamed from: b  reason: collision with root package name */
        private long f6668b;

        /* renamed from: c  reason: collision with root package name */
        private File f6669c;

        /* renamed from: d  reason: collision with root package name */
        private JSONObject f6670d;

        private a(File file) {
            this.f6670d = null;
            this.f6669c = file;
            String[] split = file.getName().split("-|\\.");
            this.f6667a = Long.parseLong(split[0]);
            this.f6668b = Long.parseLong(split[1]);
        }

        private String a() {
            return this.f6667a + Constants.FILENAME_SEQUENCE_SEPARATOR + this.f6668b + ".ctx";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j10) {
            this.f6668b = j10;
            this.f6669c.renameTo(new File(this.f6669c.getParent(), a()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject b() {
            if (this.f6670d == null) {
                try {
                    this.f6670d = new JSONObject(com.apm.insight.l.i.c(this.f6669c.getAbsolutePath()));
                } catch (Throwable unused) {
                }
                if (this.f6670d == null) {
                    this.f6670d = new JSONObject();
                }
            }
            return this.f6670d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(long j10) {
            long j11 = this.f6667a;
            if (j11 <= j10 || j11 - j10 <= 604800000) {
                long j12 = this.f6668b;
                if (j12 >= j10 || j10 - j12 <= 604800000) {
                    return this.f6669c.lastModified() < j10 && j10 - this.f6669c.lastModified() > 604800000;
                }
                return true;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            this.f6669c.delete();
        }
    }

    private s(Context context) {
        File c10 = com.apm.insight.l.o.c(context);
        if (!c10.exists() || (!c10.isDirectory() && c10.delete())) {
            c10.mkdirs();
            com.apm.insight.runtime.a.b.a();
        }
        this.f6660b = c10;
        this.f6661c = new File(c10, "did");
        this.f6662d = new File(c10, "device_uuid");
        this.f6663e = context;
    }

    public static int a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (Header.c(jSONObject)) {
            return 2;
        }
        if (Header.c(jSONObject2)) {
            return 0;
        }
        return (String.valueOf(jSONObject2.opt("update_version_code")).equals(String.valueOf(jSONObject.opt("update_version_code"))) && Header.d(jSONObject)) ? 1 : 2;
    }

    public static s a() {
        if (f6659a == null) {
            f6659a = new s(com.apm.insight.h.g());
        }
        return f6659a;
    }

    private void a(long j10, long j11, JSONObject jSONObject, JSONArray jSONArray) {
        File file = this.f6660b;
        File file2 = new File(file, "" + j10 + Constants.FILENAME_SEQUENCE_SEPARATOR + j11 + ".ctx");
        File file3 = this.f6660b;
        File file4 = new File(file3, "" + j10 + Constants.FILENAME_SEQUENCE_SEPARATOR + j11 + ".allData");
        try {
            com.apm.insight.l.i.a(file2, jSONObject, false);
            com.apm.insight.l.i.a(file4, jSONArray, false);
            this.f6664f = new a(file2);
        } catch (IOException e10) {
            com.apm.insight.b.a().a("NPTH_CATCH", e10);
        }
    }

    private a c() {
        if (this.f6664f == null) {
            d(".ctx");
        }
        return this.f6664f;
    }

    private void c(long j10) {
        try {
            ArrayList<a> d10 = d("");
            if (d10.size() <= 6) {
                return;
            }
            Iterator<a> it = d10.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.b(j10)) {
                    next.c();
                }
            }
        } catch (Throwable th) {
            com.apm.insight.b.a().a("NPTH_CATCH", th);
        }
    }

    private File d(long j10) {
        Iterator<a> it = d(".ctx").iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (j10 >= next.f6667a && j10 <= next.f6668b) {
                return next.f6669c;
            }
        }
        return null;
    }

    private ArrayList<a> d(final String str) {
        File[] listFiles = this.f6660b.listFiles(new FilenameFilter() { // from class: com.apm.insight.runtime.s.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str2) {
                return str2.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str2).matches();
            }
        });
        com.apm.insight.l.q.a((Object) ("foundRuntimeContextFiles " + listFiles.length));
        ArrayList<a> arrayList = new ArrayList<>();
        a aVar = null;
        for (File file : listFiles) {
            try {
                a aVar2 = new a(file);
                arrayList.add(aVar2);
                if (this.f6664f == null) {
                    if (".ctx".equals(str)) {
                        if (aVar != null && aVar2.f6668b < aVar.f6668b) {
                        }
                        aVar = aVar2;
                    }
                }
            } catch (Throwable th) {
                com.apm.insight.b.a().a("NPTH_CATCH", th);
            }
        }
        if (this.f6664f == null && aVar != null) {
            this.f6664f = aVar;
        }
        return arrayList;
    }

    private File e(long j10) {
        Iterator<a> it = d(".allData").iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (j10 >= next.f6667a && j10 <= next.f6668b) {
                return next.f6669c;
            }
        }
        return null;
    }

    private File f(long j10) {
        Iterator<a> it = d(".ctx").iterator();
        a aVar = null;
        while (it.hasNext()) {
            a next = it.next();
            if (aVar == null || Math.abs(aVar.f6668b - j10) > Math.abs(next.f6668b - j10)) {
                aVar = next;
            }
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f6669c;
    }

    private File g(long j10) {
        Iterator<a> it = d(".allData").iterator();
        a aVar = null;
        while (it.hasNext()) {
            a next = it.next();
            if (aVar == null || Math.abs(aVar.f6668b - j10) > Math.abs(next.f6668b - j10)) {
                aVar = next;
            }
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f6669c;
    }

    public String a(String str) {
        try {
            return com.apm.insight.l.i.c(this.f6662d.getAbsolutePath());
        } catch (Throwable unused) {
            return str;
        }
    }

    public JSONObject a(long j10) {
        boolean z10;
        String str;
        File d10 = d(j10);
        if (d10 == null) {
            d10 = f(j10);
            z10 = true;
        } else {
            z10 = false;
        }
        JSONObject jSONObject = null;
        if (d10 != null) {
            try {
                str = com.apm.insight.l.i.c(d10.getAbsolutePath());
            } catch (Throwable th) {
                th = th;
                str = null;
            }
            try {
                jSONObject = new JSONObject(str);
            } catch (Throwable th2) {
                th = th2;
                com.apm.insight.b.a().a("NPTH_CATCH", new IOException("content :" + str, th));
                if (jSONObject != null) {
                    try {
                        jSONObject.put("unauthentic_version", 1);
                    } catch (JSONException e10) {
                        com.apm.insight.b.a().a("NPTH_CATCH", e10);
                    }
                }
                return jSONObject;
            }
        }
        if (jSONObject != null && z10) {
            jSONObject.put("unauthentic_version", 1);
        }
        return jSONObject;
    }

    public void a(Map<String, Object> map, JSONArray jSONArray) {
        JSONObject a10 = Header.a(this.f6663e).a(map);
        if (Header.c(a10)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        a c10 = c();
        if (c10 == null) {
            a(currentTimeMillis, currentTimeMillis, a10, jSONArray);
            return;
        }
        int a11 = a(c10.b(), a10);
        if (a11 == 1) {
            a(c10.f6667a, currentTimeMillis, a10, jSONArray);
            com.apm.insight.l.i.a(c10.f6669c);
        } else if (a11 == 2) {
            a(currentTimeMillis, currentTimeMillis, a10, jSONArray);
        } else if (a11 == 3) {
            c10.a(currentTimeMillis);
        }
        c(currentTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String b() {
        try {
            return com.apm.insight.l.i.c(this.f6661c.getAbsolutePath());
        } catch (Throwable unused) {
            return "0";
        }
    }

    public JSONArray b(long j10) {
        String str;
        File e10 = e(j10);
        if (e10 == null) {
            e10 = g(j10);
        }
        if (e10 != null) {
            try {
                str = com.apm.insight.l.i.c(e10.getAbsolutePath());
            } catch (Throwable th) {
                th = th;
                str = null;
            }
            try {
                return new JSONArray(str);
            } catch (Throwable th2) {
                th = th2;
                com.apm.insight.b.a().a("NPTH_CATCH", new IOException("content :" + str, th));
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(String str) {
        try {
            com.apm.insight.l.i.a(this.f6661c, str, false);
        } catch (Throwable unused) {
        }
    }

    public void c(String str) {
        try {
            com.apm.insight.l.i.a(this.f6662d, str, false);
        } catch (Throwable unused) {
        }
    }
}
