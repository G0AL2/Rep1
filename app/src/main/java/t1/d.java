package t1;

import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: ShareFile.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f37077a;

    /* renamed from: b  reason: collision with root package name */
    private String f37078b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f37079c;

    /* renamed from: d  reason: collision with root package name */
    private String f37080d;

    /* renamed from: e  reason: collision with root package name */
    private String f37081e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f37082f;

    public d(String str, String str2, String str3, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this(str, str3, bool, reactApplicationContext);
        this.f37080d = str2;
    }

    private String a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    private String b(Uri uri) {
        return b.d(this.f37077a, uri, this.f37082f);
    }

    private boolean e() {
        char[] charArray;
        if (this.f37079c.getScheme() == null || !this.f37079c.getScheme().equals("data")) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        for (char c10 : this.f37079c.toString().substring(5).toCharArray()) {
            if (c10 == ';') {
                break;
            }
            sb2.append(c10);
        }
        this.f37080d = sb2.toString();
        return true;
    }

    private boolean g() {
        if (this.f37079c.getScheme() == null || !(this.f37079c.getScheme().equals(AppLovinEventTypes.USER_VIEWED_CONTENT) || this.f37079c.getScheme().equals("file"))) {
            return false;
        }
        if (this.f37080d != null) {
            return true;
        }
        String a10 = a(this.f37079c.toString());
        this.f37080d = a10;
        if (a10 == null) {
            String b10 = b(this.f37079c);
            if (b10 == null) {
                return false;
            }
            this.f37080d = a(b10);
        }
        if (this.f37080d == null) {
            this.f37080d = "*/*";
        }
        return true;
    }

    public String c() {
        String str = this.f37080d;
        return str == null ? "*/*" : str;
    }

    public Uri d() {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(c());
        if (e()) {
            String substring = this.f37079c.toString().substring(this.f37080d.length() + 5 + 8);
            String str = this.f37081e;
            if (str == null) {
                str = System.nanoTime() + "";
            }
            try {
                File file = new File(this.f37082f.booleanValue() ? this.f37077a.getCacheDir() : this.f37077a.getExternalCacheDir(), Environment.DIRECTORY_DOWNLOADS);
                if (!file.exists() && !file.mkdirs()) {
                    throw new IOException("mkdirs failed on " + file.getAbsolutePath());
                }
                File file2 = new File(file, str + "." + extensionFromMimeType);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(Base64.decode(substring, 0));
                fileOutputStream.flush();
                fileOutputStream.close();
                return b.a(this.f37077a, file2);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        } else if (g()) {
            Uri parse = Uri.parse(this.f37078b);
            if (parse.getPath() == null) {
                return null;
            }
            return b.a(this.f37077a, new File(parse.getPath()));
        }
        return null;
    }

    public boolean f() {
        return e() || g();
    }

    public d(String str, String str2, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this.f37078b = str;
        this.f37079c = Uri.parse(str);
        this.f37081e = str2;
        this.f37082f = bool;
        this.f37077a = reactApplicationContext;
    }
}
