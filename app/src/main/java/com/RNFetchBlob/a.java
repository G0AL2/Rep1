package com.RNFetchBlob;

import android.net.Uri;
import android.util.Base64;
import com.RNFetchBlob.g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import ye.c0;
import ye.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNFetchBlobBody.java */
/* loaded from: classes.dex */
public class a extends c0 {

    /* renamed from: a  reason: collision with root package name */
    private InputStream f5580a;

    /* renamed from: c  reason: collision with root package name */
    private ReadableArray f5582c;

    /* renamed from: d  reason: collision with root package name */
    private String f5583d;

    /* renamed from: e  reason: collision with root package name */
    private String f5584e;

    /* renamed from: f  reason: collision with root package name */
    private g.e f5585f;

    /* renamed from: g  reason: collision with root package name */
    private x f5586g;

    /* renamed from: h  reason: collision with root package name */
    private File f5587h;

    /* renamed from: b  reason: collision with root package name */
    private long f5581b = 0;

    /* renamed from: i  reason: collision with root package name */
    private Boolean f5588i = Boolean.FALSE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RNFetchBlobBody.java */
    /* renamed from: com.RNFetchBlob.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0100a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5589a;

        static {
            int[] iArr = new int[g.e.values().length];
            f5589a = iArr;
            try {
                iArr[g.e.SingleFile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5589a[g.e.AsIs.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5589a[g.e.Others.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RNFetchBlobBody.java */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public String f5590a;

        /* renamed from: b  reason: collision with root package name */
        String f5591b;

        /* renamed from: c  reason: collision with root package name */
        String f5592c;

        /* renamed from: d  reason: collision with root package name */
        public String f5593d;

        b(a aVar, ReadableMap readableMap) {
            if (readableMap.hasKey("name")) {
                this.f5590a = readableMap.getString("name");
            }
            if (readableMap.hasKey("filename")) {
                this.f5591b = readableMap.getString("filename");
            }
            if (readableMap.hasKey("type")) {
                this.f5592c = readableMap.getString("type");
            } else {
                this.f5592c = this.f5591b == null ? "text/plain" : "application/octet-stream";
            }
            if (readableMap.hasKey("data")) {
                this.f5593d = readableMap.getString("data");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str) {
        this.f5583d = str;
    }

    private ArrayList<b> c() throws IOException {
        int length;
        long j10;
        ArrayList<b> arrayList = new ArrayList<>();
        ReactApplicationContext reactApplicationContext = RNFetchBlob.RCTContext;
        long j11 = 0;
        for (int i10 = 0; i10 < this.f5582c.size(); i10++) {
            b bVar = new b(this, this.f5582c.getMap(i10));
            arrayList.add(bVar);
            String str = bVar.f5593d;
            if (str == null) {
                h.a("RNFetchBlob multipart request builder has found a field without `data` property, the field `" + bVar.f5590a + "` will be removed implicitly.");
            } else {
                if (bVar.f5591b != null) {
                    if (str.startsWith("RNFetchBlob-file://")) {
                        String w10 = d.w(str.substring(19));
                        if (d.q(w10)) {
                            try {
                                length = reactApplicationContext.getAssets().open(w10.replace("bundle-assets://", "")).available();
                            } catch (IOException e10) {
                                h.a(e10.getLocalizedMessage());
                            }
                        } else {
                            j10 = new File(d.w(w10)).length();
                            j11 += j10;
                        }
                    } else if (str.startsWith("RNFetchBlob-content://")) {
                        String substring = str.substring(22);
                        InputStream inputStream = null;
                        try {
                            try {
                                inputStream = reactApplicationContext.getContentResolver().openInputStream(Uri.parse(substring));
                                j11 += inputStream.available();
                            } catch (Exception e11) {
                                h.a("Failed to estimate form data length from content URI:" + substring + ", " + e11.getLocalizedMessage());
                                if (inputStream == null) {
                                }
                            }
                            inputStream.close();
                        } catch (Throwable th) {
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    } else {
                        length = Base64.decode(str, 0).length;
                    }
                } else {
                    length = str.getBytes().length;
                }
                j10 = length;
                j11 += j10;
            }
        }
        this.f5581b = j11;
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x016f, code lost:
        if (r10 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.io.File d() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.a.d():java.io.File");
    }

    private void e(long j10) {
        f j11 = g.j(this.f5583d);
        if (j11 != null) {
            long j12 = this.f5581b;
            if (j12 == 0 || !j11.a(((float) j10) / ((float) j12))) {
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putString("taskId", this.f5583d);
            createMap.putString("written", String.valueOf(j10));
            createMap.putString("total", String.valueOf(this.f5581b));
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) RNFetchBlob.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNFetchBlobProgress-upload", createMap);
        }
    }

    private InputStream f() throws Exception {
        if (this.f5584e.startsWith("RNFetchBlob-file://")) {
            String w10 = d.w(this.f5584e.substring(19));
            if (d.q(w10)) {
                try {
                    return RNFetchBlob.RCTContext.getAssets().open(w10.replace("bundle-assets://", ""));
                } catch (Exception e10) {
                    throw new Exception("error when getting request stream from asset : " + e10.getLocalizedMessage());
                }
            }
            File file = new File(d.w(w10));
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
                return new FileInputStream(file);
            } catch (Exception e11) {
                throw new Exception("error when getting request stream: " + e11.getLocalizedMessage());
            }
        } else if (this.f5584e.startsWith("RNFetchBlob-content://")) {
            String substring = this.f5584e.substring(22);
            try {
                return RNFetchBlob.RCTContext.getContentResolver().openInputStream(Uri.parse(substring));
            } catch (Exception e12) {
                throw new Exception("error when getting request stream for content URI: " + substring, e12);
            }
        } else {
            try {
                return new ByteArrayInputStream(Base64.decode(this.f5584e, 0));
            } catch (Exception e13) {
                throw new Exception("error when getting request stream: " + e13.getLocalizedMessage());
            }
        }
    }

    private void g(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
        byte[] bArr = new byte[10240];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                return;
            }
        }
    }

    private void h(InputStream inputStream, mf.g gVar) throws IOException {
        byte[] bArr = new byte[10240];
        long j10 = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, 10240);
            if (read > 0) {
                gVar.write(bArr, 0, read);
                j10 += read;
                e(j10);
            } else {
                inputStream.close();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a(boolean z10) {
        this.f5588i = Boolean.valueOf(z10);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        try {
            File file = this.f5587h;
            if (file == null || !file.exists()) {
                return true;
            }
            this.f5587h.delete();
            return true;
        } catch (Exception e10) {
            h.a(e10.getLocalizedMessage());
            return false;
        }
    }

    @Override // ye.c0
    public long contentLength() {
        if (this.f5588i.booleanValue()) {
            return -1L;
        }
        return this.f5581b;
    }

    @Override // ye.c0
    public x contentType() {
        return this.f5586g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a i(ReadableArray readableArray) {
        this.f5582c = readableArray;
        try {
            this.f5587h = d();
            this.f5580a = new FileInputStream(this.f5587h);
            this.f5581b = this.f5587h.length();
        } catch (Exception e10) {
            e10.printStackTrace();
            h.a("RNFetchBlob failed to create request multipart body :" + e10.getLocalizedMessage());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a j(String str) {
        this.f5584e = str;
        if (str == null) {
            this.f5584e = "";
            this.f5585f = g.e.AsIs;
        }
        try {
            int i10 = C0100a.f5589a[this.f5585f.ordinal()];
            if (i10 == 1) {
                InputStream f10 = f();
                this.f5580a = f10;
                this.f5581b = f10.available();
            } else if (i10 == 2) {
                this.f5581b = this.f5584e.getBytes().length;
                this.f5580a = new ByteArrayInputStream(this.f5584e.getBytes());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            h.a("RNFetchBlob failed to create single content request body :" + e10.getLocalizedMessage() + "\r\n");
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a k(x xVar) {
        this.f5586g = xVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a l(g.e eVar) {
        this.f5585f = eVar;
        return this;
    }

    @Override // ye.c0
    public void writeTo(mf.g gVar) {
        try {
            h(this.f5580a, gVar);
        } catch (Exception e10) {
            h.a(e10.getLocalizedMessage());
            e10.printStackTrace();
        }
    }
}
