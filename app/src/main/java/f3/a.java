package f3;

import a3.c;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.f.g;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import d3.e;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;
import y2.i;

/* compiled from: Util.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f30090a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f30091b = Charset.forName("UTF-8");

    /* compiled from: Util.java */
    /* renamed from: f3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0380a implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        private Pattern f30092a = Pattern.compile("^cpu[0-9]+$");

        C0380a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.f30092a.matcher(str).matches();
        }
    }

    public static int a() {
        File[] listFiles;
        if (Build.VERSION.SDK_INT >= 17) {
            return Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (!file.exists() || (listFiles = file.listFiles(new C0380a())) == null) {
                return 1;
            }
            return Math.max(listFiles.length, 1);
        } catch (Throwable unused) {
            return 1;
        }
    }

    public static int b(d3.a aVar) {
        int lastIndexOf;
        if (aVar == null) {
            return -1;
        }
        if (aVar.a() == 200) {
            return c(aVar.c("Content-Length", null), -1);
        }
        if (aVar.a() == 206) {
            String c10 = aVar.c("Content-Range", null);
            if (!TextUtils.isEmpty(c10) && (lastIndexOf = c10.lastIndexOf("/")) >= 0 && lastIndexOf < c10.length() - 1) {
                return c(c10.substring(lastIndexOf + 1), -1);
            }
        }
        return -1;
    }

    public static int c(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return i10;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static a3.a d(d3.a aVar, c cVar, String str, int i10) {
        String str2;
        String str3;
        String str4;
        a3.a a10 = cVar.a(str, i10);
        if (a10 == null) {
            int b10 = b(aVar);
            String c10 = aVar.c("Content-Type", null);
            if (b10 <= 0 || TextUtils.isEmpty(c10)) {
                return a10;
            }
            e j10 = aVar.j();
            if (j10 != null) {
                str3 = j10.f29053a;
                str2 = v(j10.f29054b);
            } else {
                str2 = "";
                str3 = str2;
            }
            String u10 = u(aVar.f());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IronSourceConstants.REQUEST_URL, str3);
                jSONObject.put("requestHeaders", str2);
                jSONObject.put("responseHeaders", u10);
                str4 = jSONObject.toString();
            } catch (Throwable unused) {
                str4 = "";
            }
            a3.a aVar2 = new a3.a(str, c10, b10, i10, str4);
            cVar.f(aVar2);
            return aVar2;
        }
        return a10;
    }

    public static String e(int i10, int i11) {
        String t10 = t(i10, i11);
        if (t10 == null) {
            return null;
        }
        return "bytes=" + t10;
    }

    public static String f(a3.a aVar, int i10) {
        StringBuilder sb2 = new StringBuilder();
        if (i10 <= 0) {
            sb2.append("HTTP/1.1 200 OK");
            sb2.append("\r\n");
        } else {
            sb2.append("HTTP/1.1 206 Partial Content");
            sb2.append("\r\n");
        }
        sb2.append("Accept-Ranges: bytes");
        sb2.append("\r\n");
        sb2.append("Content-Type: ");
        sb2.append(aVar.f52b);
        sb2.append("\r\n");
        if (i10 <= 0) {
            sb2.append("Content-Length: ");
            sb2.append(aVar.f53c);
            sb2.append("\r\n");
        } else {
            sb2.append("Content-Range: bytes ");
            sb2.append(i10);
            sb2.append(Constants.FILENAME_SEQUENCE_SEPARATOR);
            sb2.append(aVar.f53c - 1);
            sb2.append("/");
            sb2.append(aVar.f53c);
            sb2.append("\r\n");
            sb2.append("Content-Length: ");
            sb2.append(aVar.f53c - i10);
            sb2.append("\r\n");
        }
        sb2.append("Connection: close");
        sb2.append("\r\n");
        sb2.append("\r\n");
        String sb3 = sb2.toString();
        if (y2.e.f39190d) {
            Log.i("TAG_PROXY_WRITE_TO_MP", sb3);
        }
        return sb3;
    }

    public static String g(d3.a aVar, int i10) {
        int b10;
        if (aVar == null || !aVar.e()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aVar.h().toUpperCase());
        sb2.append(' ');
        sb2.append(aVar.a());
        sb2.append(' ');
        sb2.append(aVar.i());
        sb2.append("\r\n");
        if (y2.e.f39190d) {
            Log.i("TAG_PROXY_headers", aVar.h().toUpperCase() + " " + aVar.a() + " " + aVar.i());
        }
        List<i.b> i11 = i(aVar.f());
        boolean z10 = true;
        if (i11 != null) {
            int size = i11.size();
            for (int i12 = 0; i12 < size; i12++) {
                i.b bVar = i11.get(i12);
                if (bVar != null) {
                    String str = bVar.f39240a;
                    String str2 = bVar.f39241b;
                    sb2.append(str);
                    sb2.append(": ");
                    sb2.append(str2);
                    sb2.append("\r\n");
                    if ("Content-Range".equalsIgnoreCase(str) || ("Accept-Ranges".equalsIgnoreCase(str) && "bytes".equalsIgnoreCase(str2))) {
                        z10 = false;
                    }
                }
            }
        }
        if (z10 && (b10 = b(aVar)) > 0) {
            sb2.append("Content-Range: bytes ");
            sb2.append(Math.max(i10, 0));
            sb2.append(Constants.FILENAME_SEQUENCE_SEPARATOR);
            sb2.append(b10 - 1);
            sb2.append("/");
            sb2.append(b10);
            sb2.append("\r\n");
        }
        sb2.append("Connection: close");
        sb2.append("\r\n");
        sb2.append("\r\n");
        String sb3 = sb2.toString();
        if (y2.e.f39190d) {
            Log.i("TAG_PROXY_WRITE_TO_MP", sb3);
        }
        return sb3;
    }

    public static String h(d3.a aVar, boolean z10, boolean z11) {
        String c10;
        if (aVar == null) {
            if (y2.e.f39190d) {
                Log.e("TAG_PROXY_Response", "response null");
            }
            return "response null";
        } else if (!aVar.e()) {
            if (y2.e.f39190d) {
                Log.e("TAG_PROXY_Response", "response code: " + aVar.a());
            }
            return "response code: " + aVar.a();
        } else {
            String c11 = aVar.c("Content-Type", null);
            if (!x(c11)) {
                if (y2.e.f39190d) {
                    Log.e("TAG_PROXY_Response", "Content-Type: " + c11);
                }
                return "Content-Type: " + c11;
            }
            int b10 = b(aVar);
            if (b10 <= 0) {
                if (y2.e.f39190d) {
                    Log.e("TAG_PROXY_Response", "Content-Length: " + b10);
                }
                return "Content-Length: " + b10;
            } else if (z10 && ((c10 = aVar.c("Accept-Ranges", null)) == null || !c10.contains("bytes"))) {
                if (y2.e.f39190d) {
                    Log.e("TAG_PROXY_Response", "Accept-Ranges: " + c10);
                }
                return "Accept-Ranges: " + c10;
            } else if (z11 && aVar.g() == null) {
                if (y2.e.f39190d) {
                    Log.e("TAG_PROXY_Response", "response body null");
                }
                return "response body null";
            } else {
                return null;
            }
        }
    }

    public static List<i.b> i(List<i.b> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        if (y2.e.f39190d) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                i.b bVar = list.get(i10);
                if (bVar != null) {
                    Log.i("TAG_PROXY_PRE_FILTER", bVar.f39240a + ": " + bVar.f39240a);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (i.b bVar2 : list) {
            if ("Host".equals(bVar2.f39240a) || "Keep-Alive".equals(bVar2.f39240a) || "Connection".equals(bVar2.f39240a) || "Proxy-Connection".equals(bVar2.f39240a)) {
                arrayList.add(bVar2);
            }
        }
        list.removeAll(arrayList);
        if (y2.e.f39190d) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                i.b bVar3 = list.get(i11);
                if (bVar3 != null) {
                    Log.i("TAG_PROXY_POST_FILTER", bVar3.f39240a + ": " + bVar3.f39241b);
                }
            }
        }
        return list;
    }

    public static List<i.b> j(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            try {
                Set<Map.Entry<String, String>> entrySet = map.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : entrySet) {
                    arrayList.add(new i.b(entry.getKey(), entry.getValue()));
                }
                return arrayList;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public static List<String> k(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (r(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static void l(g gVar) {
        if (gVar != null) {
            if (w()) {
                com.bytedance.sdk.component.f.e.a(gVar);
                if (y2.e.f39190d) {
                    Log.e("TAG_PROXY_UTIL", "invoke in pool thread");
                    return;
                }
                return;
            }
            gVar.run();
            if (y2.e.f39190d) {
                Log.e("TAG_PROXY_UTIL", "invoke calling thread");
            }
        }
    }

    public static void m(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void n(RandomAccessFile randomAccessFile) {
        if (randomAccessFile != null) {
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void o(Runnable runnable) {
        if (runnable != null) {
            if (w()) {
                runnable.run();
            } else {
                f30090a.post(runnable);
            }
        }
    }

    public static void p(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void q(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean r(String str) {
        return str != null && (str.startsWith("http://") || str.startsWith("https://"));
    }

    public static int s(String str) {
        return c(str, 0);
    }

    public static String t(int i10, int i11) {
        if (i10 >= 0 && i11 > 0) {
            return i10 + Constants.FILENAME_SEQUENCE_SEPARATOR + i11;
        } else if (i10 > 0) {
            return i10 + Constants.FILENAME_SEQUENCE_SEPARATOR;
        } else if (i10 >= 0 || i11 <= 0) {
            return null;
        } else {
            return Constants.FILENAME_SEQUENCE_SEPARATOR + i11;
        }
    }

    public static String u(List<i.b> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            i.b bVar = list.get(0);
            if (bVar != null) {
                sb2.append(bVar.f39240a);
                sb2.append(": ");
                sb2.append(bVar.f39241b);
                sb2.append("\r\n");
            }
        }
        return sb2.toString();
    }

    public static String v(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append((Object) entry.getKey());
            sb2.append(": ");
            sb2.append((Object) entry.getValue());
            sb2.append("\r\n");
        }
        return sb2.toString();
    }

    public static boolean w() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static boolean x(String str) {
        return str != null && (str.startsWith("video/") || "application/octet-stream".equals(str) || "binary/octet-stream".equals(str));
    }
}
