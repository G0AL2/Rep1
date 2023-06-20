package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import androidx.core.app.e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a  reason: collision with root package name */
    final Object f634a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f635b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<c, a> f636c;

    /* renamed from: d  reason: collision with root package name */
    final MediaSessionCompat.Token f637d;

    /* loaded from: classes.dex */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f638a;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i10, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f638a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f634a) {
                mediaControllerCompat$MediaControllerImplApi21.f637d.e(b.a.X(e.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.f637d.f(g1.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                mediaControllerCompat$MediaControllerImplApi21.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends c.b {
        a(c cVar) {
            super(cVar);
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void A(Bundle bundle) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void K(CharSequence charSequence) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void u(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void v() throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void w(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void y(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            throw new AssertionError();
        }
    }

    void a() {
        if (this.f637d.c() == null) {
            return;
        }
        for (c cVar : this.f635b) {
            a aVar = new a(cVar);
            this.f636c.put(cVar, aVar);
            cVar.f668a = aVar;
            try {
                this.f637d.c().q(aVar);
                cVar.i(13, null, null);
            } catch (RemoteException e10) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
            }
        }
        this.f635b.clear();
    }
}
