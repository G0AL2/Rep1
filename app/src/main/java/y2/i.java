package y2;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.AdRequest;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Request.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public final c f39231a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f39232b;

    /* renamed from: c  reason: collision with root package name */
    public final a f39233c;

    /* compiled from: Request.java */
    /* loaded from: classes.dex */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int f39234a;

        /* renamed from: b  reason: collision with root package name */
        final String f39235b;

        /* renamed from: c  reason: collision with root package name */
        final String f39236c;

        /* renamed from: d  reason: collision with root package name */
        final int f39237d;

        /* renamed from: e  reason: collision with root package name */
        final int f39238e;

        /* renamed from: f  reason: collision with root package name */
        final List<String> f39239f;

        private a(int i10, String str, String str2, int i11, int i12, String str3, List<String> list) {
            this.f39234a = i10;
            this.f39235b = str;
            this.f39236c = str2;
            this.f39237d = i11;
            this.f39238e = i12;
            this.f39239f = list;
        }

        static a a(c cVar, List<b> list) throws d {
            String str;
            int i10;
            int i11;
            int indexOf = cVar.f39243b.indexOf("?");
            if (indexOf != -1) {
                ArrayList arrayList = new ArrayList();
                String str2 = null;
                String str3 = null;
                String str4 = null;
                int i12 = 0;
                for (String str5 : cVar.f39243b.substring(indexOf + 1).split("&")) {
                    String[] split = str5.split("=");
                    if (split.length == 2) {
                        if ("rk".equals(split[0])) {
                            str3 = Uri.decode(split[1]);
                        } else if ("k".equals(split[0])) {
                            str4 = Uri.decode(split[1]);
                        } else if (split[0].startsWith("u")) {
                            arrayList.add(Uri.decode(split[1]));
                        } else if (InneractiveMediationDefs.GENDER_FEMALE.equals(split[0]) && f3.a.s(split[1]) == 1) {
                            i12 = 1;
                        }
                    }
                }
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                    if (list != null) {
                        i11 = 0;
                        int i13 = 0;
                        for (b bVar : list) {
                            if (bVar != null && "Range".equalsIgnoreCase(bVar.f39240a)) {
                                int indexOf2 = bVar.f39241b.indexOf("=");
                                if (indexOf2 != -1) {
                                    if ("bytes".equalsIgnoreCase(bVar.f39241b.substring(0, indexOf2).trim())) {
                                        String substring = bVar.f39241b.substring(indexOf2 + 1);
                                        if (!substring.contains(",")) {
                                            int indexOf3 = substring.indexOf(Constants.FILENAME_SEQUENCE_SEPARATOR);
                                            if (indexOf3 != -1) {
                                                String trim = substring.substring(0, indexOf3).trim();
                                                String trim2 = substring.substring(indexOf3 + 1).trim();
                                                try {
                                                    if (trim.length() > 0) {
                                                        i11 = Integer.parseInt(trim);
                                                    }
                                                    if (trim2.length() > 0 && i11 > (i13 = Integer.parseInt(trim2))) {
                                                        throw new d("Range format error, Range: " + bVar.f39241b);
                                                    }
                                                    str2 = bVar.f39241b;
                                                } catch (NumberFormatException unused) {
                                                    throw new d("Range format error, Range: " + bVar.f39241b);
                                                }
                                            } else {
                                                throw new d("Range format error, Range: " + bVar.f39241b);
                                            }
                                        } else {
                                            throw new d("Range format error, Range: " + bVar.f39241b);
                                        }
                                    } else {
                                        throw new d("Range format error, Range: " + bVar.f39241b);
                                    }
                                } else {
                                    throw new d("Range format error, Range: " + bVar.f39241b);
                                }
                            }
                        }
                        i10 = i13;
                        str = str2;
                    } else {
                        str = null;
                        i10 = 0;
                        i11 = 0;
                    }
                    if (!arrayList.isEmpty()) {
                        return new a(i12, str3, str4, i11, i10, str, arrayList);
                    }
                    throw new d("no url found: path: " + cVar.f39243b);
                }
                throw new d("rawKey or key is empty, path: " + cVar.f39243b);
            }
            throw new d("path format error, path: " + cVar.f39243b);
        }

        public String toString() {
            return "Extra{flag=" + this.f39234a + ", rawKey='" + this.f39235b + "', key='" + this.f39236c + "', from=" + this.f39237d + ", to=" + this.f39238e + ", urls=" + this.f39239f + '}';
        }
    }

    /* compiled from: Request.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f39240a;

        /* renamed from: b  reason: collision with root package name */
        public final String f39241b;

        public b(String str, String str2) {
            this.f39240a = str;
            this.f39241b = str2;
        }

        static b a(String str) throws d {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                String trim = str.substring(0, indexOf).trim();
                String trim2 = str.substring(indexOf + 1).trim();
                if (trim.length() != 0 && trim2.length() != 0) {
                    return new b(trim, trim2);
                }
                throw new d("request header format error, header: " + str);
            }
            throw new d("request header format error, header: " + str);
        }

        public String toString() {
            return "Header{name='" + this.f39240a + "', value='" + this.f39241b + "'}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Request.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        final String f39242a;

        /* renamed from: b  reason: collision with root package name */
        final String f39243b;

        /* renamed from: c  reason: collision with root package name */
        final String f39244c;

        private c(String str, String str2, String str3) {
            this.f39242a = str;
            this.f39243b = str2;
            this.f39244c = str3;
        }

        static c a(String str) throws d {
            int indexOf = str.indexOf(32);
            if (indexOf != -1) {
                int lastIndexOf = str.lastIndexOf(32);
                if (lastIndexOf > indexOf) {
                    String trim = str.substring(0, indexOf).trim();
                    String trim2 = str.substring(indexOf + 1, lastIndexOf).trim();
                    String trim3 = str.substring(lastIndexOf + 1).trim();
                    if (trim.length() != 0 && trim2.length() != 0 && trim3.length() != 0) {
                        return new c(trim, trim2, trim3);
                    }
                    throw new d("request line format error, line: " + str);
                }
                throw new d("request line format error, line: " + str);
            }
            throw new d("request line format error, line: " + str);
        }

        public String toString() {
            return "RequestLine{method='" + this.f39242a + "', path='" + this.f39243b + "', version='" + this.f39244c + "'}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Request.java */
    /* loaded from: classes.dex */
    public static final class d extends Exception {
        d(String str) {
            super(str);
        }
    }

    public i(c cVar, List<b> list, a aVar) {
        this.f39231a = cVar;
        this.f39232b = list;
        this.f39233c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, String str2, List<String> list) {
        StringBuilder sb2 = new StringBuilder((int) AdRequest.MAX_CONTENT_URL_LENGTH);
        String str3 = null;
        do {
            if (str3 != null) {
                if (list.size() == 1) {
                    return null;
                }
                list.remove(list.size() - 1);
            }
            str3 = b(sb2, str, str2, list);
        } while (str3.length() > 3072);
        return str3;
    }

    private static String b(StringBuilder sb2, String str, String str2, List<String> list) {
        sb2.delete(0, sb2.length());
        sb2.append("rk");
        sb2.append("=");
        sb2.append(Uri.encode(str));
        sb2.append("&");
        sb2.append("k");
        sb2.append("=");
        sb2.append(Uri.encode(str2));
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append("&");
            sb2.append("u");
            sb2.append(i10);
            sb2.append("=");
            sb2.append(Uri.encode(list.get(i10)));
        }
        return sb2.toString();
    }

    public static i c(InputStream inputStream) throws IOException, d {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f3.a.f30091b));
        ArrayList arrayList = new ArrayList();
        c cVar = null;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                break;
            }
            String trim = readLine.trim();
            if (cVar == null) {
                cVar = c.a(trim);
            } else {
                arrayList.add(b.a(trim));
            }
        }
        if (cVar != null) {
            return new i(cVar, arrayList, a.a(cVar, arrayList));
        }
        throw new d("request line is null");
    }

    public String toString() {
        return "Request{requestLine=" + this.f39231a + ", headers=" + this.f39232b + ", extra=" + this.f39233c + '}';
    }
}
