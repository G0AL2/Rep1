package t1;

import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ShareFiles.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f37083a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<Uri> f37084b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<String> f37085c;

    /* renamed from: d  reason: collision with root package name */
    private String f37086d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f37087e;

    public e(ReadableArray readableArray, ArrayList<String> arrayList, String str, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this(readableArray, arrayList, bool, reactApplicationContext);
        this.f37086d = str;
    }

    private String a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    private String b(Uri uri) {
        return b.d(this.f37083a, uri, this.f37087e);
    }

    private boolean e(Uri uri) {
        if (uri.getScheme() == null || !uri.getScheme().equals("data")) {
            return false;
        }
        String substring = uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(";"));
        String str = this.f37086d;
        if (str == null) {
            this.f37086d = substring;
            return true;
        } else if (!str.equalsIgnoreCase(substring) && this.f37086d.split("/")[0].equalsIgnoreCase(substring.split("/")[0])) {
            this.f37086d = this.f37086d.split("/")[0].concat("/*");
            return true;
        } else if (this.f37086d.equalsIgnoreCase(substring)) {
            return true;
        } else {
            this.f37086d = "*/*";
            return true;
        }
    }

    private boolean g(Uri uri) {
        if ((uri.getScheme() == null || !uri.getScheme().equals(AppLovinEventTypes.USER_VIEWED_CONTENT)) && !"file".equals(uri.getScheme())) {
            return false;
        }
        String a10 = a(uri.toString());
        if (a10 == null) {
            a10 = a(b(uri));
        }
        if (a10 == null) {
            a10 = "*/*";
        }
        String str = this.f37086d;
        if (str == null) {
            this.f37086d = a10;
            return true;
        } else if (!str.equalsIgnoreCase(a10) && this.f37086d.split("/")[0].equalsIgnoreCase(a10.split("/")[0])) {
            this.f37086d = this.f37086d.split("/")[0].concat("/*");
            return true;
        } else if (this.f37086d.equalsIgnoreCase(a10)) {
            return true;
        } else {
            this.f37086d = "*/*";
            return true;
        }
    }

    public String c() {
        String str = this.f37086d;
        return str == null ? "*/*" : str;
    }

    public ArrayList<Uri> d() {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        ArrayList<Uri> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < this.f37084b.size(); i10++) {
            Uri uri = this.f37084b.get(i10);
            if (e(uri)) {
                String extensionFromMimeType = singleton.getExtensionFromMimeType(uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(";")));
                String substring = uri.getSchemeSpecificPart().substring(uri.getSchemeSpecificPart().indexOf(";base64,") + 8);
                String str = this.f37085c.size() >= i10 + 1 ? this.f37085c.get(i10) : System.currentTimeMillis() + "." + extensionFromMimeType;
                try {
                    File file = new File(this.f37087e.booleanValue() ? this.f37083a.getCacheDir() : this.f37083a.getExternalCacheDir(), Environment.DIRECTORY_DOWNLOADS);
                    if (!file.exists() && !file.mkdirs()) {
                        throw new IOException("mkdirs failed on " + file.getAbsolutePath());
                        break;
                    }
                    File file2 = new File(file, str);
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    fileOutputStream.write(Base64.decode(substring, 0));
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    arrayList.add(b.a(this.f37083a, file2));
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            } else if (g(uri) && uri.getPath() != null) {
                if (this.f37085c.size() >= i10 + 1) {
                    arrayList.add(b.a(this.f37083a, new File(uri.getPath(), this.f37085c.get(i10))));
                } else {
                    arrayList.add(b.a(this.f37083a, new File(uri.getPath())));
                }
            }
        }
        return arrayList;
    }

    public boolean f() {
        Iterator<Uri> it = this.f37084b.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            Uri next = it.next();
            if (e(next) || g(next)) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (!z10) {
                break;
            }
        }
        return z10;
    }

    public e(ReadableArray readableArray, ArrayList<String> arrayList, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this.f37084b = new ArrayList<>();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            String string = readableArray.getString(i10);
            if (string != null) {
                this.f37084b.add(Uri.parse(string));
            }
        }
        this.f37085c = arrayList;
        this.f37087e = bool;
        this.f37083a = reactApplicationContext;
    }
}
