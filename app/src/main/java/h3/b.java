package h3;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import java.util.HashMap;

/* compiled from: MediaUtils.java */
/* loaded from: classes.dex */
public class b {

    /* compiled from: MediaUtils.java */
    /* loaded from: classes.dex */
    public static class a extends AsyncTask<String, Integer, Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        private InterfaceC0398b f31088a;

        /* renamed from: b  reason: collision with root package name */
        private long f31089b;

        public a(InterfaceC0398b interfaceC0398b, long j10) {
            this.f31089b = 0L;
            this.f31088a = interfaceC0398b;
            this.f31089b = j10;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Bitmap doInBackground(String... strArr) {
            Bitmap bitmap = null;
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                String str = strArr[0];
                if (str.startsWith("http")) {
                    mediaMetadataRetriever.setDataSource(str, new HashMap());
                } else {
                    mediaMetadataRetriever.setDataSource(str);
                }
                bitmap = mediaMetadataRetriever.getFrameAtTime(this.f31089b * 1000, 3);
                mediaMetadataRetriever.release();
                return bitmap;
            } catch (Throwable th) {
                o3.c.m("MediaUtils", "MediaUtils doInBackground : ", th);
                return bitmap;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            InterfaceC0398b interfaceC0398b = this.f31088a;
            if (interfaceC0398b != null) {
                interfaceC0398b.a(bitmap);
            }
        }
    }

    /* compiled from: MediaUtils.java */
    /* renamed from: h3.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0398b {
        void a(Bitmap bitmap);
    }

    public static void a(long j10, String str, InterfaceC0398b interfaceC0398b) {
        new a(interfaceC0398b, j10).execute(str);
    }
}
