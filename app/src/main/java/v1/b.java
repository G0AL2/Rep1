package v1;

import com.RNFetchBlob.g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import mf.f;
import mf.f0;
import mf.h;
import mf.r;
import ye.e0;
import ye.x;

/* compiled from: RNFetchBlobFileResp.java */
/* loaded from: classes.dex */
public class b extends e0 {

    /* renamed from: b  reason: collision with root package name */
    String f37759b;

    /* renamed from: c  reason: collision with root package name */
    e0 f37760c;

    /* renamed from: e  reason: collision with root package name */
    ReactApplicationContext f37762e;

    /* renamed from: f  reason: collision with root package name */
    FileOutputStream f37763f;

    /* renamed from: d  reason: collision with root package name */
    long f37761d = 0;

    /* renamed from: g  reason: collision with root package name */
    boolean f37764g = false;

    /* compiled from: RNFetchBlobFileResp.java */
    /* renamed from: v1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0519b implements mf.e0 {
        private C0519b() {
        }

        private void a(String str, long j10, long j11) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("taskId", str);
            createMap.putString("written", String.valueOf(j10));
            createMap.putString("total", String.valueOf(j11));
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) b.this.f37762e.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNFetchBlobProgress", createMap);
        }

        @Override // mf.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            b.this.f37763f.close();
        }

        @Override // mf.e0
        public long e0(f fVar, long j10) throws IOException {
            float f10;
            int i10 = (int) j10;
            try {
                byte[] bArr = new byte[i10];
                long read = b.this.f37760c.a().read(bArr, 0, i10);
                b bVar = b.this;
                int i11 = (read > 0L ? 1 : (read == 0L ? 0 : -1));
                bVar.f37761d += i11 > 0 ? read : 0L;
                if (i11 > 0) {
                    bVar.f37763f.write(bArr, 0, (int) read);
                } else if (bVar.e() == -1 && read == -1) {
                    b.this.f37764g = true;
                }
                com.RNFetchBlob.f i12 = g.i(b.this.f37759b);
                if (b.this.e() != 0) {
                    if (b.this.e() != -1) {
                        b bVar2 = b.this;
                        f10 = (float) (bVar2.f37761d / bVar2.e());
                    } else {
                        f10 = b.this.f37764g ? 1.0f : 0.0f;
                    }
                    if (i12 != null && i12.a(f10)) {
                        if (b.this.e() != -1) {
                            b bVar3 = b.this;
                            a(bVar3.f37759b, bVar3.f37761d, bVar3.e());
                        } else {
                            b bVar4 = b.this;
                            if (!bVar4.f37764g) {
                                a(bVar4.f37759b, 0L, bVar4.e());
                            } else {
                                String str = bVar4.f37759b;
                                long j11 = bVar4.f37761d;
                                a(str, j11, j11);
                            }
                        }
                    }
                }
                return read;
            } catch (Exception unused) {
                return -1L;
            }
        }

        @Override // mf.e0
        public f0 k() {
            return null;
        }
    }

    public b(ReactApplicationContext reactApplicationContext, String str, e0 e0Var, String str2, boolean z10) throws IOException {
        this.f37762e = reactApplicationContext;
        this.f37759b = str;
        this.f37760c = e0Var;
        if (str2 != null) {
            boolean z11 = !z10;
            String replace = str2.replace("?append=true", "");
            File file = new File(replace);
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IllegalStateException("Couldn't create dir: " + parentFile);
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            this.f37763f = new FileOutputStream(new File(replace), z11);
        }
    }

    @Override // ye.e0
    public long e() {
        return this.f37760c.e();
    }

    @Override // ye.e0
    public x h() {
        return this.f37760c.h();
    }

    @Override // ye.e0
    public h q() {
        return r.d(new C0519b());
    }

    public boolean y() {
        return this.f37761d == e() || (e() == -1 && this.f37764g);
    }
}
