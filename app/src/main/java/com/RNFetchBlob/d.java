package com.RNFetchBlob;

import android.content.res.AssetFileDescriptor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNFetchBlobFS.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: e  reason: collision with root package name */
    private static HashMap<String, d> f5608e = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private ReactApplicationContext f5609a;

    /* renamed from: b  reason: collision with root package name */
    private DeviceEventManagerModule.RCTDeviceEventEmitter f5610b;

    /* renamed from: c  reason: collision with root package name */
    private String f5611c = "base64";

    /* renamed from: d  reason: collision with root package name */
    private OutputStream f5612d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RNFetchBlobFS.java */
    /* loaded from: classes.dex */
    public class a extends AsyncTask<String, Integer, Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f5613a;

        a(Callback callback) {
            this.f5613a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Integer doInBackground(String... strArr) {
            String[] list;
            WritableArray createArray = Arguments.createArray();
            if (strArr[0] == null) {
                this.f5613a.invoke("the path specified for lstat is either `null` or `undefined`.");
                return 0;
            }
            File file = new File(strArr[0]);
            if (!file.exists()) {
                this.f5613a.invoke("failed to lstat path `" + strArr[0] + "` because it does not exist or it is not a folder");
                return 0;
            }
            if (file.isDirectory()) {
                for (String str : file.list()) {
                    createArray.pushMap(d.D(file.getPath() + "/" + str));
                }
            } else {
                createArray.pushMap(d.D(file.getAbsolutePath()));
            }
            this.f5613a.invoke(null, createArray);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RNFetchBlobFS.java */
    /* loaded from: classes.dex */
    public class b implements MediaScannerConnection.OnScanCompletedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f5614a;

        b(d dVar, Callback callback) {
            this.f5614a = callback;
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            this.f5614a.invoke(null, Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RNFetchBlobFS.java */
    /* loaded from: classes.dex */
    public class c extends AsyncTask<ReadableArray, Integer, Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f5615a;

        c(Callback callback) {
            this.f5615a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Integer doInBackground(ReadableArray... readableArrayArr) {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < readableArrayArr[0].size(); i10++) {
                    String string = readableArrayArr[0].getString(i10);
                    File file = new File(string);
                    if (file.exists() && !file.delete()) {
                        arrayList.add(string);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f5615a.invoke(null, Boolean.TRUE);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to delete: ");
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append(", ");
                    }
                    this.f5615a.invoke(sb2.toString());
                }
            } catch (Exception e10) {
                this.f5615a.invoke(e10.getLocalizedMessage());
            }
            return Integer.valueOf(readableArrayArr[0].size());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(ReactApplicationContext reactApplicationContext) {
        this.f5609a = reactApplicationContext;
        this.f5610b = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void B(String str, String str2, int i10, int i11, String str3, Promise promise) {
        try {
            String w10 = w(str);
            File file = new File(w10);
            if (file.isDirectory()) {
                promise.reject("EISDIR", "Expecting a file but '" + w10 + "' is a directory");
            } else if (!file.exists()) {
                promise.reject("ENOENT", "No such file '" + w10 + "'");
            } else {
                int length = (int) file.length();
                int min = Math.min(length, i11) - i10;
                FileInputStream fileInputStream = new FileInputStream(new File(w10));
                FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
                int skip = (int) fileInputStream.skip(i10);
                if (skip != i10) {
                    promise.reject("EUNSPECIFIED", "Skipped " + skip + " instead of the specified " + i10 + " bytes, size is " + length);
                    return;
                }
                byte[] bArr = new byte[10240];
                int i12 = 0;
                while (i12 < min) {
                    int read = fileInputStream.read(bArr, 0, 10240);
                    int i13 = min - i12;
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, Math.min(i13, read));
                    i12 += read;
                }
                fileInputStream.close();
                fileOutputStream.flush();
                fileOutputStream.close();
                promise.resolve(str2);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void C(String str, Callback callback) {
        try {
            String w10 = w(str);
            WritableMap D = D(w10);
            if (D == null) {
                callback.invoke("failed to stat path `" + w10 + "` because it does not exist or it is not a folder", null);
            } else {
                callback.invoke(null, D);
            }
        } catch (Exception e10) {
            callback.invoke(e10.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WritableMap D(String str) {
        try {
            String w10 = w(str);
            WritableMap createMap = Arguments.createMap();
            if (q(w10)) {
                String replace = w10.replace("bundle-assets://", "");
                AssetFileDescriptor openFd = RNFetchBlob.RCTContext.getAssets().openFd(replace);
                createMap.putString("filename", replace);
                createMap.putString("path", w10);
                createMap.putString("type", "asset");
                createMap.putString("size", String.valueOf(openFd.getLength()));
                createMap.putInt("lastModified", 0);
            } else {
                File file = new File(w10);
                if (!file.exists()) {
                    return null;
                }
                createMap.putString("filename", file.getName());
                createMap.putString("path", file.getPath());
                createMap.putString("type", file.isDirectory() ? "directory" : "file");
                createMap.putString("size", String.valueOf(file.length()));
                createMap.putString("lastModified", String.valueOf(file.lastModified()));
            }
            return createMap;
        } catch (Exception unused) {
            return null;
        }
    }

    private static byte[] E(String str, String str2) {
        if (str2.equalsIgnoreCase("ascii")) {
            return str.getBytes(Charset.forName("US-ASCII"));
        }
        if (str2.toLowerCase().contains("base64")) {
            return Base64.decode(str, 2);
        }
        if (str2.equalsIgnoreCase("utf8")) {
            return str.getBytes(Charset.forName("UTF-8"));
        }
        return str.getBytes(Charset.forName("US-ASCII"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void F(String str, Callback callback) {
        try {
            e(new File(w(str)));
            callback.invoke(null, Boolean.TRUE);
        } catch (Exception e10) {
            callback.invoke(e10.getLocalizedMessage(), Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void G(String str, ReadableArray readableArray, Callback callback) {
        try {
            OutputStream outputStream = f5608e.get(str).f5612d;
            byte[] bArr = new byte[readableArray.size()];
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                bArr[i10] = (byte) readableArray.getInt(i10);
            }
            outputStream.write(bArr);
            callback.invoke(new Object[0]);
        } catch (Exception e10) {
            callback.invoke(e10.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void H(String str, String str2, Callback callback) {
        d dVar = f5608e.get(str);
        try {
            dVar.f5612d.write(E(str2, dVar.f5611c));
            callback.invoke(new Object[0]);
        } catch (Exception e10) {
            callback.invoke(e10.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void I(String str, ReadableArray readableArray, boolean z10, Promise promise) {
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!file.exists()) {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    promise.reject("ENOTDIR", "Failed to create parent directory of '" + str + "'");
                    return;
                } else if (!file.createNewFile()) {
                    promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created");
                    return;
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file, z10);
            byte[] bArr = new byte[readableArray.size()];
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                bArr[i10] = (byte) readableArray.getInt(i10);
            }
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            promise.resolve(Integer.valueOf(readableArray.size()));
        } catch (FileNotFoundException unused) {
            promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created");
        } catch (Exception e10) {
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void J(String str, String str2, String str3, boolean z10, Promise promise) {
        int length;
        FileOutputStream fileOutputStream;
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!file.exists()) {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    promise.reject("EUNSPECIFIED", "Failed to create parent directory of '" + str + "'");
                    return;
                } else if (!file.createNewFile()) {
                    promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created");
                    return;
                }
            }
            if (str2.equalsIgnoreCase("uri")) {
                String w10 = w(str3);
                File file2 = new File(w10);
                if (!file2.exists()) {
                    promise.reject("ENOENT", "No such file '" + str + "' ('" + w10 + "')");
                    return;
                }
                byte[] bArr = new byte[10240];
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file2);
                    try {
                        fileOutputStream = new FileOutputStream(file, z10);
                        length = 0;
                        while (true) {
                            try {
                                int read = fileInputStream2.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                                length += read;
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                        }
                        fileInputStream2.close();
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } else {
                byte[] E = E(str3, str2);
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, z10);
                try {
                    fileOutputStream2.write(E);
                    length = E.length;
                } finally {
                    fileOutputStream2.close();
                }
            }
            promise.resolve(Integer.valueOf(length));
        } catch (FileNotFoundException unused) {
            promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created, or it is a directory");
        } catch (Exception e10) {
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, Callback callback) {
        try {
            OutputStream outputStream = f5608e.get(str).f5612d;
            f5608e.remove(str);
            outputStream.close();
            callback.invoke(new Object[0]);
        } catch (Exception e10) {
            callback.invoke(e10.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f8 A[Catch: Exception -> 0x00f4, TRY_LEAVE, TryCatch #6 {Exception -> 0x00f4, blocks: (B:54:0x00f0, B:58:0x00f8), top: B:62:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(java.lang.String r6, java.lang.String r7, com.facebook.react.bridge.Callback r8) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.d.b(java.lang.String, java.lang.String, com.facebook.react.bridge.Callback):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(String str, String str2, String str3, Promise promise) {
        try {
            File file = new File(str);
            boolean createNewFile = file.createNewFile();
            if (str3.equals("uri")) {
                File file2 = new File(str2.replace("RNFetchBlob-file://", ""));
                if (!file2.exists()) {
                    promise.reject("ENOENT", "Source file : " + str2 + " does not exist");
                    return;
                }
                FileInputStream fileInputStream = new FileInputStream(file2);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[10240];
                for (int read = fileInputStream.read(bArr); read > 0; read = fileInputStream.read(bArr)) {
                    fileOutputStream.write(bArr, 0, read);
                }
                fileInputStream.close();
                fileOutputStream.close();
            } else if (!createNewFile) {
                promise.reject("EEXIST", "File `" + str + "` already exists");
                return;
            } else {
                new FileOutputStream(file).write(E(str2, str3));
            }
            promise.resolve(str);
        } catch (Exception e10) {
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(String str, ReadableArray readableArray, Promise promise) {
        try {
            File file = new File(str);
            if (!file.createNewFile()) {
                promise.reject("EEXIST", "File at path `" + str + "` already exists");
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[readableArray.size()];
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                bArr[i10] = (byte) readableArray.getInt(i10);
            }
            fileOutputStream.write(bArr);
            promise.resolve(str);
        } catch (Exception e10) {
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    private static void e(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                throw new NullPointerException("Received null trying to list files of directory '" + file + "'");
            }
            for (File file2 : listFiles) {
                e(file2);
            }
        }
        if (file.delete()) {
            return;
        }
        throw new IOException("Failed to delete '" + file + "'");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(Callback callback) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        WritableMap createMap = Arguments.createMap();
        if (Build.VERSION.SDK_INT >= 18) {
            createMap.putString("internal_free", String.valueOf(statFs.getFreeBytes()));
            createMap.putString("internal_total", String.valueOf(statFs.getTotalBytes()));
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
            createMap.putString("external_free", String.valueOf(statFs2.getFreeBytes()));
            createMap.putString("external_total", String.valueOf(statFs2.getTotalBytes()));
        }
        callback.invoke(null, createMap);
    }

    private void g(String str, String str2, WritableArray writableArray) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("event", str2);
        createMap.putArray("detail", writableArray);
        this.f5610b.emit(str, createMap);
    }

    private void h(String str, String str2, String str3) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("event", str2);
        createMap.putString("detail", str3);
        this.f5610b.emit(str, createMap);
    }

    private void i(String str, String str2, String str3, String str4) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("event", str2);
        createMap.putString(Analytics.Param.CODE, str3);
        createMap.putString("detail", str4);
        this.f5610b.emit(str, createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(String str, Callback callback) {
        if (q(str)) {
            try {
                RNFetchBlob.RCTContext.getAssets().openFd(str.replace("bundle-assets://", ""));
                callback.invoke(Boolean.TRUE, Boolean.FALSE);
                return;
            } catch (IOException unused) {
                Boolean bool = Boolean.FALSE;
                callback.invoke(bool, bool);
                return;
            }
        }
        String w10 = w(str);
        if (w10 != null) {
            callback.invoke(Boolean.valueOf(new File(w10).exists()), Boolean.valueOf(new File(w10).isDirectory()));
            return;
        }
        Boolean bool2 = Boolean.FALSE;
        callback.invoke(bool2, bool2);
    }

    public static void k(ReactApplicationContext reactApplicationContext, Promise promise) {
        if (Environment.getExternalStorageState().equals("mounted")) {
            try {
                promise.resolve(reactApplicationContext.getExternalFilesDir(null).getParentFile().getAbsolutePath());
                return;
            } catch (Exception e10) {
                promise.reject("RNFetchBlob.getSDCardApplicationDir", e10.getLocalizedMessage());
                return;
            }
        }
        promise.reject("RNFetchBlob.getSDCardApplicationDir", "External storage not mounted");
    }

    public static void l(Promise promise) {
        if (Environment.getExternalStorageState().equals("mounted")) {
            promise.resolve(Environment.getExternalStorageDirectory().getAbsolutePath());
        } else {
            promise.reject("RNFetchBlob.getSDCardDir", "External storage not mounted");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> m(ReactApplicationContext reactApplicationContext) {
        HashMap hashMap = new HashMap();
        hashMap.put("DocumentDir", reactApplicationContext.getFilesDir().getAbsolutePath());
        hashMap.put("CacheDir", reactApplicationContext.getCacheDir().getAbsolutePath());
        hashMap.put("DCIMDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
        hashMap.put("PictureDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        hashMap.put("MusicDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath());
        hashMap.put("DownloadDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        hashMap.put("MovieDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath());
        hashMap.put("RingtoneDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RINGTONES).getAbsolutePath());
        if (Environment.getExternalStorageState().equals("mounted")) {
            hashMap.put("SDCardDir", Environment.getExternalStorageDirectory().getAbsolutePath());
            File externalFilesDir = reactApplicationContext.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                hashMap.put("SDCardApplicationDir", externalFilesDir.getParentFile().getAbsolutePath());
            } else {
                hashMap.put("SDCardApplicationDir", "");
            }
        }
        hashMap.put("MainBundleDir", reactApplicationContext.getApplicationInfo().dataDir);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String n(String str) {
        return RNFetchBlob.RCTContext.getFilesDir() + "/RNFetchBlobTmp_" + str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void o(String str, String str2, Promise promise) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("md5", "MD5");
            hashMap.put("sha1", "SHA-1");
            hashMap.put("sha224", "SHA-224");
            hashMap.put("sha256", "SHA-256");
            hashMap.put("sha384", "SHA-384");
            hashMap.put("sha512", "SHA-512");
            if (!hashMap.containsKey(str2)) {
                promise.reject("EINVAL", "Invalid algorithm '" + str2 + "', must be one of md5, sha1, sha224, sha256, sha384, sha512");
                return;
            }
            File file = new File(str);
            if (file.isDirectory()) {
                promise.reject("EISDIR", "Expecting a file but '" + str + "' is a directory");
            } else if (file.exists()) {
                MessageDigest messageDigest = MessageDigest.getInstance((String) hashMap.get(str2));
                FileInputStream fileInputStream = new FileInputStream(str);
                byte[] bArr = new byte[1048576];
                if (file.length() != 0) {
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, read);
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                byte[] digest = messageDigest.digest();
                int length = digest.length;
                for (int i10 = 0; i10 < length; i10++) {
                    sb2.append(String.format("%02x", Byte.valueOf(digest[i10])));
                }
                promise.resolve(sb2.toString());
            } else {
                promise.reject("ENOENT", "No such file '" + str + "'");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    private static InputStream p(String str) throws IOException {
        if (str.startsWith("bundle-assets://")) {
            return RNFetchBlob.RCTContext.getAssets().open(str.replace("bundle-assets://", ""));
        }
        return new FileInputStream(new File(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean q(String str) {
        return str != null && str.startsWith("bundle-assets://");
    }

    private static boolean r(String str) {
        if (str.startsWith("bundle-assets://")) {
            try {
                RNFetchBlob.RCTContext.getAssets().open(str.replace("bundle-assets://", ""));
                return true;
            } catch (IOException unused) {
                return false;
            }
        }
        return new File(str).exists();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void s(String str, Promise promise) {
        try {
            String w10 = w(str);
            File file = new File(w10);
            if (!file.exists()) {
                promise.reject("ENOENT", "No such file '" + w10 + "'");
            } else if (file.isDirectory()) {
                String[] list = new File(w10).list();
                WritableArray createArray = Arguments.createArray();
                for (String str2 : list) {
                    createArray.pushString(str2);
                }
                promise.resolve(createArray);
            } else {
                promise.reject("ENOTDIR", "Not a directory '" + w10 + "'");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void t(String str, Callback callback) {
        new a(callback).execute(w(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void u(String str, Promise promise) {
        File file = new File(str);
        if (file.exists()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file.isDirectory() ? "Folder" : "File");
            sb2.append(" '");
            sb2.append(str);
            sb2.append("' already exists");
            promise.reject("EEXIST", sb2.toString());
            return;
        }
        try {
            if (!file.mkdirs()) {
                promise.reject("EUNSPECIFIED", "mkdir failed to create some or all directories in '" + str + "'");
                return;
            }
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void v(String str, String str2, Callback callback) {
        File file = new File(str);
        if (!file.exists()) {
            callback.invoke("Source file at path `" + str + "` does not exist");
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            byte[] bArr = new byte[IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    fileOutputStream.flush();
                    file.delete();
                    callback.invoke(new Object[0]);
                    return;
                }
            }
        } catch (FileNotFoundException unused) {
            callback.invoke("Source file not found.");
        } catch (Exception e10) {
            callback.invoke(e10.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String w(String str) {
        if (str == null) {
            return null;
        }
        if (str.matches("\\w+\\:.*")) {
            if (str.startsWith("file://")) {
                return str.replace("file://", "");
            }
            return str.startsWith("bundle-assets://") ? str : w1.a.c(RNFetchBlob.RCTContext, Uri.parse(str));
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cd, code lost:
        if (r0 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
        if (r0 == 2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d1, code lost:
        r10.resolve(new java.lang.String(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00db, code lost:
        r10.resolve(new java.lang.String(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e4, code lost:
        r9 = com.facebook.react.bridge.Arguments.createArray();
        r0 = r4.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e9, code lost:
        if (r3 >= r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00eb, code lost:
        r9.pushInt(r4[r3]);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f3, code lost:
        r10.resolve(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076 A[Catch: Exception -> 0x00ff, FileNotFoundException -> 0x0108, TryCatch #2 {FileNotFoundException -> 0x0108, Exception -> 0x00ff, blocks: (B:7:0x000e, B:9:0x0014, B:14:0x0076, B:16:0x0093, B:35:0x00d1, B:36:0x00db, B:37:0x00e4, B:39:0x00eb, B:40:0x00f3, B:41:0x00f7, B:23:0x00ae, B:26:0x00b8, B:29:0x00c2, B:11:0x003f, B:12:0x005b), top: B:51:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093 A[Catch: Exception -> 0x00ff, FileNotFoundException -> 0x0108, TryCatch #2 {FileNotFoundException -> 0x0108, Exception -> 0x00ff, blocks: (B:7:0x000e, B:9:0x0014, B:14:0x0076, B:16:0x0093, B:35:0x00d1, B:36:0x00db, B:37:0x00e4, B:39:0x00eb, B:40:0x00f3, B:41:0x00f7, B:23:0x00ae, B:26:0x00b8, B:29:0x00c2, B:11:0x003f, B:12:0x005b), top: B:51:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void x(java.lang.String r8, java.lang.String r9, com.facebook.react.bridge.Promise r10) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.d.x(java.lang.String, java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void z(ReadableArray readableArray, Callback callback) {
        new c(callback).execute(readableArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(String[] strArr, String[] strArr2, Callback callback) {
        try {
            MediaScannerConnection.scanFile(this.f5609a, strArr, strArr2, new b(this, callback));
        } catch (Exception e10) {
            callback.invoke(e10.getLocalizedMessage(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(String str, String str2, boolean z10, Callback callback) {
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!file.exists()) {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    callback.invoke("ENOTDIR", "Failed to create parent directory of '" + str + "'");
                    return;
                } else if (!file.createNewFile()) {
                    callback.invoke("ENOENT", "File '" + str + "' does not exist and could not be created");
                    return;
                }
            } else if (file.isDirectory()) {
                callback.invoke("EISDIR", "Expecting a file but '" + str + "' is a directory");
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(str, z10);
            this.f5611c = str2;
            String uuid = UUID.randomUUID().toString();
            f5608e.put(uuid, this);
            this.f5612d = fileOutputStream;
            callback.invoke(null, null, uuid);
        } catch (Exception e10) {
            callback.invoke("EUNSPECIFIED", "Failed to create write stream at path `" + str + "`; " + e10.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010e A[Catch: Exception -> 0x0117, FileNotFoundException -> 0x0137, TryCatch #2 {FileNotFoundException -> 0x0137, Exception -> 0x0117, blocks: (B:6:0x0018, B:14:0x002b, B:16:0x0031, B:20:0x005b, B:23:0x0069, B:24:0x0073, B:26:0x0079, B:28:0x008e, B:54:0x010e, B:55:0x0113, B:30:0x0094, B:32:0x009c, B:34:0x00a2, B:36:0x00a9, B:37:0x00b1, B:39:0x00b6, B:41:0x00bd, B:43:0x00c3, B:47:0x00cc, B:50:0x00e4, B:48:0x00da, B:52:0x00f0, B:18:0x0042, B:19:0x0051), top: B:61:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y(java.lang.String r17, java.lang.String r18, int r19, int r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.d.y(java.lang.String, java.lang.String, int, int, java.lang.String):void");
    }
}
