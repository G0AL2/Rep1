package com.apm.insight.nativecrash;

import android.text.TextUtils;
import com.apm.insight.l.i;
import com.apm.insight.l.k;
import com.apm.insight.l.o;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class c {

    /* loaded from: classes.dex */
    public static class a extends C0106c {
        a(File file) {
            super(file);
            this.f6533b = "Total FD Count:";
            this.f6534c = ":";
            this.f6535d = -2;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends C0106c {
        b(File file) {
            super(file);
            this.f6533b = "VmSize:";
            this.f6534c = "\\s+";
            this.f6535d = -1;
        }
    }

    /* renamed from: com.apm.insight.nativecrash.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0106c {

        /* renamed from: a  reason: collision with root package name */
        protected File f6532a;

        /* renamed from: b  reason: collision with root package name */
        protected String f6533b;

        /* renamed from: c  reason: collision with root package name */
        protected String f6534c;

        /* renamed from: d  reason: collision with root package name */
        protected int f6535d;

        public C0106c(File file) {
            this.f6532a = file;
        }

        public int a() {
            Throwable th;
            int i10;
            if (!this.f6532a.exists() || !this.f6532a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f6532a));
                int i11 = -1;
                do {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        i11 = a(readLine);
                    } catch (Throwable th2) {
                        th = th2;
                        i10 = i11;
                        bufferedReader = bufferedReader2;
                        try {
                            com.apm.insight.b.a().a("NPTH_CATCH", th);
                            return i10;
                        } finally {
                            if (bufferedReader != null) {
                                k.a(bufferedReader);
                            }
                        }
                    }
                } while (i11 == -1);
                k.a(bufferedReader2);
                return i11;
            } catch (Throwable th3) {
                th = th3;
                i10 = -1;
            }
        }

        public int a(String str) {
            int i10 = this.f6535d;
            if (str.startsWith(this.f6533b)) {
                try {
                    i10 = Integer.parseInt(str.split(this.f6534c)[1].trim());
                } catch (NumberFormatException e10) {
                    com.apm.insight.b.a().a("NPTH_CATCH", e10);
                }
                if (i10 < 0) {
                    return -2;
                }
                return i10;
            }
            return i10;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends C0106c {
        d(File file) {
            super(file);
        }

        public HashMap<String, List<String>> b() {
            JSONArray b10;
            HashMap<String, List<String>> hashMap = new HashMap<>();
            try {
                b10 = i.b(this.f6532a.getAbsolutePath());
            } catch (IOException unused) {
            } catch (Throwable th) {
                com.apm.insight.b.a().a("NPTH_CATCH", th);
            }
            if (b10 == null) {
                return hashMap;
            }
            for (int i10 = 0; i10 < b10.length(); i10++) {
                String optString = b10.optString(i10);
                if (!TextUtils.isEmpty(optString) && optString.startsWith("[tid:0") && optString.endsWith("sigstack:0x0]")) {
                    int indexOf = optString.indexOf("[routine:0x");
                    int i11 = indexOf + 11;
                    String substring = indexOf > 0 ? optString.substring(i11, optString.indexOf(93, i11)) : "unknown addr";
                    List<String> list = hashMap.get(substring);
                    if (list == null) {
                        list = new ArrayList<>();
                        hashMap.put(substring, list);
                    }
                    list.add(optString);
                }
            }
            return hashMap;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends C0106c {
        e(File file) {
            super(file);
        }

        public JSONArray a(HashMap<String, List<String>> hashMap) {
            JSONArray b10;
            List<String> list;
            JSONArray jSONArray = new JSONArray();
            if (hashMap.isEmpty()) {
                return jSONArray;
            }
            try {
                b10 = i.b(this.f6532a.getAbsolutePath());
            } catch (IOException unused) {
            } catch (Throwable th) {
                com.apm.insight.b.a().a("NPTH_CATCH", th);
            }
            if (b10 == null) {
                return jSONArray;
            }
            for (int i10 = 0; i10 < b10.length(); i10++) {
                String optString = b10.optString(i10);
                if (!TextUtils.isEmpty(optString)) {
                    String substring = optString.substring(2, optString.indexOf(":"));
                    if (hashMap.containsKey(substring) && (list = hashMap.get(substring)) != null) {
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            jSONArray.put(it.next() + " " + optString);
                        }
                        hashMap.remove(substring);
                    }
                }
            }
            for (List<String> list2 : hashMap.values()) {
                Iterator<String> it2 = list2.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next() + "  0x000000:unknown");
                }
            }
            return jSONArray;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends C0106c {
        f(File file) {
            super(file);
            this.f6533b = "Total Threads Count:";
            this.f6534c = ":";
            this.f6535d = -2;
        }
    }

    public static int a(String str) {
        return new a(o.b(str)).a();
    }

    public static JSONArray a(File file, File file2) {
        return new e(file2).a(new d(file).b());
    }

    public static int b(String str) {
        return new f(o.c(str)).a();
    }

    public static int c(String str) {
        return new b(o.d(str)).a();
    }
}
