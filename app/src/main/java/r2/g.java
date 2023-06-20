package r2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import q2.b;
import q2.v;

/* compiled from: HttpHeaderParser.java */
/* loaded from: classes.dex */
public class g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<q2.g> a(List<q2.g> list, b.a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            for (q2.g gVar : list) {
                treeSet.add(gVar.a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<q2.g> list2 = aVar.f35783h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (q2.g gVar2 : aVar.f35783h) {
                    if (!treeSet.contains(gVar2.a())) {
                        arrayList.add(gVar2);
                    }
                }
            }
        } else if (!aVar.f35782g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.f35782g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new q2.g(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    static String b(long j10) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, String> c(b.a aVar) {
        if (aVar == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        String str = aVar.f35777b;
        if (str != null) {
            hashMap.put("If-None-Match", str);
        }
        long j10 = aVar.f35779d;
        if (j10 > 0) {
            hashMap.put("If-Modified-Since", b(j10));
        }
        return hashMap;
    }

    private static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static b.a e(q2.k kVar) {
        boolean z10;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = kVar.f35810b;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long h10 = str != null ? h(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i11 = 0;
            j10 = 0;
            j11 = 0;
            while (i10 < split.length) {
                String trim = split[i10].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j10 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j11 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
            z10 = true;
        } else {
            z10 = false;
            j10 = 0;
            j11 = 0;
        }
        String str3 = map.get("Expires");
        long h11 = str3 != null ? h(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long h12 = str4 != null ? h(str4) : 0L;
        String str5 = map.get("ETag");
        if (z10) {
            j13 = currentTimeMillis + (j10 * 1000);
            if (i10 != 0) {
                j14 = j13;
            } else {
                Long.signum(j11);
                j14 = (j11 * 1000) + j13;
            }
            j12 = j14;
        } else {
            j12 = 0;
            if (h10 <= 0 || h11 < h10) {
                j13 = 0;
            } else {
                j13 = currentTimeMillis + (h11 - h10);
                j12 = j13;
            }
        }
        b.a aVar = new b.a();
        aVar.f35776a = kVar.f35809a;
        aVar.f35777b = str5;
        aVar.f35781f = j13;
        aVar.f35780e = j12;
        aVar.f35778c = h10;
        aVar.f35779d = h12;
        aVar.f35782g = map;
        aVar.f35783h = kVar.f35811c;
        return aVar;
    }

    public static String f(Map<String, String> map) {
        return g(map, "ISO-8859-1");
    }

    public static String g(Map<String, String> map, String str) {
        String str2;
        if (map != null && (str2 = map.get("Content-Type")) != null) {
            String[] split = str2.split(";", 0);
            for (int i10 = 1; i10 < split.length; i10++) {
                String[] split2 = split[i10].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    public static long h(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e10) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                v.d(e10, "Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            v.e("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<q2.g> i(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new q2.g(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, String> j(List<q2.g> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (q2.g gVar : list) {
            treeMap.put(gVar.a(), gVar.b());
        }
        return treeMap;
    }
}
