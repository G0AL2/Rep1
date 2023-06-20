package v1;

import com.RNFetchBlob.g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.IOException;
import java.nio.charset.Charset;
import mf.f;
import mf.f0;
import mf.h;
import mf.r;
import ye.e0;
import ye.x;

/* compiled from: RNFetchBlobDefaultResp.java */
/* loaded from: classes.dex */
public class a extends e0 {

    /* renamed from: b  reason: collision with root package name */
    String f37752b;

    /* renamed from: c  reason: collision with root package name */
    ReactApplicationContext f37753c;

    /* renamed from: d  reason: collision with root package name */
    e0 f37754d;

    /* renamed from: e  reason: collision with root package name */
    boolean f37755e;

    /* compiled from: RNFetchBlobDefaultResp.java */
    /* renamed from: v1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0518a implements mf.e0 {

        /* renamed from: a  reason: collision with root package name */
        h f37756a;

        /* renamed from: b  reason: collision with root package name */
        long f37757b = 0;

        C0518a(h hVar) {
            this.f37756a = hVar;
        }

        @Override // mf.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // mf.e0
        public long e0(f fVar, long j10) throws IOException {
            long e02 = this.f37756a.e0(fVar, j10);
            this.f37757b += e02 > 0 ? e02 : 0L;
            com.RNFetchBlob.f i10 = g.i(a.this.f37752b);
            long e10 = a.this.e();
            if (i10 != null && e10 != 0 && i10.a((float) (this.f37757b / a.this.e()))) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("taskId", a.this.f37752b);
                createMap.putString("written", String.valueOf(this.f37757b));
                createMap.putString("total", String.valueOf(a.this.e()));
                if (a.this.f37755e) {
                    createMap.putString("chunk", fVar.J0(Charset.defaultCharset()));
                } else {
                    createMap.putString("chunk", "");
                }
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) a.this.f37753c.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNFetchBlobProgress", createMap);
            }
            return e02;
        }

        @Override // mf.e0
        public f0 k() {
            return null;
        }
    }

    public a(ReactApplicationContext reactApplicationContext, String str, e0 e0Var, boolean z10) {
        this.f37755e = false;
        this.f37753c = reactApplicationContext;
        this.f37752b = str;
        this.f37754d = e0Var;
        this.f37755e = z10;
    }

    @Override // ye.e0
    public long e() {
        return this.f37754d.e();
    }

    @Override // ye.e0
    public x h() {
        return this.f37754d.h();
    }

    @Override // ye.e0
    public h q() {
        return r.d(new C0518a(this.f37754d.q()));
    }
}
