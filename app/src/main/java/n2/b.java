package n2;

import android.content.Context;
import android.util.Log;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: APSNetworkManager.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: d */
    private static final String f34626d = "b";

    /* renamed from: e */
    private static b f34627e;

    /* renamed from: a */
    private Context f34628a;

    /* renamed from: c */
    private final ExecutorService f34630c = Executors.newFixedThreadPool(1);

    /* renamed from: b */
    private boolean f34629b = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: APSNetworkManager.java */
    /* loaded from: classes.dex */
    public class a extends Thread {
        a() {
            b.this = r1;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                b.this.f34629b = true;
                Log.d(b.f34626d, "App is shutting down, terminating the thread executor");
                b.this.f34630c.shutdown();
            } catch (RuntimeException e10) {
                Log.e(b.f34626d, "Error in stopping the executor", e10);
            }
        }
    }

    private b(Context context) {
        this.f34628a = context;
        Runtime.getRuntime().addShutdownHook(new a());
    }

    public static /* synthetic */ void a(b bVar, m2.a aVar) {
        bVar.i(aVar);
    }

    private void e(InputStream inputStream, OutputStream outputStream, HttpsURLConnection httpsURLConnection) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException | RuntimeException e10) {
                Log.e(f34626d, "Unable to close the out stream", e10);
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException | RuntimeException e11) {
                Log.e(f34626d, "Unable to close the in stream", e11);
            }
        }
        try {
            httpsURLConnection.disconnect();
        } catch (RuntimeException e12) {
            Log.e(f34626d, "Unable to close the url connection", e12);
        }
    }

    private synchronized void f(Runnable runnable) {
        try {
            if (!this.f34629b) {
                this.f34630c.execute(runnable);
            }
        } catch (InternalError e10) {
            Log.e(f34626d, "Internal error in executing the thread", e10);
            h(e10);
        } catch (RuntimeException e11) {
            Log.e(f34626d, "Error running the thread", e11);
        }
    }

    public static b g(Context context) {
        if (f34627e == null) {
            f34627e = new b(context);
        }
        return f34627e;
    }

    private void h(InternalError internalError) {
        if (internalError.getLocalizedMessage().contains("shutdown")) {
            Log.e(f34626d, "Got the shutdown signal", internalError);
        }
    }

    /* renamed from: j */
    public boolean i(m2.a aVar) {
        HttpsURLConnection httpsURLConnection;
        OutputStream outputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                httpsURLConnection = (HttpsURLConnection) new URL(l2.a.d()).openConnection();
                try {
                    if (k(httpsURLConnection)) {
                        outputStream = new BufferedOutputStream(httpsURLConnection.getOutputStream());
                        try {
                            String g10 = aVar.g();
                            outputStream.write(g10.getBytes());
                            outputStream.flush();
                            String str = f34626d;
                            Log.d(str, "Sending the event data: " + g10);
                            int responseCode = httpsURLConnection.getResponseCode();
                            Log.d(str, "Response code received : " + responseCode);
                            if (responseCode == 200) {
                                byte[] bArr = new byte[IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES];
                                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(httpsURLConnection.getInputStream());
                                try {
                                    bufferedInputStream2.read(bArr);
                                    Log.d(str, "Response received: " + new String(bArr));
                                    e(bufferedInputStream2, outputStream, httpsURLConnection);
                                    return true;
                                } catch (IOException e10) {
                                    e = e10;
                                    bufferedInputStream = bufferedInputStream2;
                                    Log.e(f34626d, "Error in sendData: ", e);
                                    e(bufferedInputStream, outputStream, httpsURLConnection);
                                    return false;
                                } catch (RuntimeException e11) {
                                    e = e11;
                                    bufferedInputStream = bufferedInputStream2;
                                    Log.e(f34626d, "Error in sendData: ", e);
                                    e(bufferedInputStream, outputStream, httpsURLConnection);
                                    return false;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedInputStream = bufferedInputStream2;
                                    e(bufferedInputStream, outputStream, httpsURLConnection);
                                    throw th;
                                }
                            }
                        } catch (IOException e12) {
                            e = e12;
                        } catch (RuntimeException e13) {
                            e = e13;
                        }
                    } else {
                        outputStream = null;
                    }
                    e(null, outputStream, httpsURLConnection);
                    return false;
                } catch (IOException e14) {
                    e = e14;
                    outputStream = null;
                    Log.e(f34626d, "Error in sendData: ", e);
                    e(bufferedInputStream, outputStream, httpsURLConnection);
                    return false;
                } catch (RuntimeException e15) {
                    e = e15;
                    outputStream = null;
                    Log.e(f34626d, "Error in sendData: ", e);
                    e(bufferedInputStream, outputStream, httpsURLConnection);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                }
            } catch (IOException e16) {
                e = e16;
                httpsURLConnection = null;
                outputStream = null;
                Log.e(f34626d, "Error in sendData: ", e);
                e(bufferedInputStream, outputStream, httpsURLConnection);
                return false;
            } catch (RuntimeException e17) {
                e = e17;
                httpsURLConnection = null;
                outputStream = null;
                Log.e(f34626d, "Error in sendData: ", e);
                e(bufferedInputStream, outputStream, httpsURLConnection);
                return false;
            } catch (Throwable th3) {
                th = th3;
                httpsURLConnection = null;
                outputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private boolean k(HttpsURLConnection httpsURLConnection) {
        try {
            httpsURLConnection.setReadTimeout(10000);
            httpsURLConnection.setConnectTimeout(10000);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setChunkedStreamingMode(0);
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setRequestProperty("Content-Type", "application/json");
            httpsURLConnection.setRequestProperty("x-api-key", l2.a.b());
            httpsURLConnection.connect();
            return true;
        } catch (IOException e10) {
            Log.e(f34626d, "Error in setting the connection parameter:", e10);
            return false;
        }
    }

    private void m(final m2.a aVar) {
        f(new Runnable() { // from class: n2.a
            @Override // java.lang.Runnable
            public final void run() {
                b.a(b.this, aVar);
            }
        });
    }

    public void l(m2.a aVar) {
        if (aVar.b() == m2.b.FATAL) {
            m(aVar);
        }
    }
}
