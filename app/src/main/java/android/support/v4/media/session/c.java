package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: MediaControllerCompat.java */
/* loaded from: classes.dex */
public abstract class c implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    android.support.v4.media.session.a f668a;

    /* compiled from: MediaControllerCompat.java */
    /* loaded from: classes.dex */
    private static class a extends MediaController.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f669a;

        a(c cVar) {
            this.f669a = new WeakReference<>(cVar);
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            c cVar = this.f669a.get();
            if (cVar != null) {
                cVar.a(new d(playbackInfo.getPlaybackType(), AudioAttributesCompat.c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.a(bundle);
            c cVar = this.f669a.get();
            if (cVar != null) {
                cVar.b(bundle);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            c cVar = this.f669a.get();
            if (cVar != null) {
                cVar.c(MediaMetadataCompat.c(mediaMetadata));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            c cVar = this.f669a.get();
            if (cVar == null || cVar.f668a != null) {
                return;
            }
            cVar.d(PlaybackStateCompat.c(playbackState));
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            c cVar = this.f669a.get();
            if (cVar != null) {
                cVar.e(MediaSessionCompat.QueueItem.e(list));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            c cVar = this.f669a.get();
            if (cVar != null) {
                cVar.f(charSequence);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            c cVar = this.f669a.get();
            if (cVar != null) {
                cVar.g();
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            c cVar = this.f669a.get();
            if (cVar != null) {
                if (cVar.f668a == null || Build.VERSION.SDK_INT >= 23) {
                    cVar.h(str, bundle);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaControllerCompat.java */
    /* loaded from: classes.dex */
    public static class b extends a.AbstractBinderC0028a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f670a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(c cVar) {
            this.f670a = new WeakReference<>(cVar);
        }

        public void A(Bundle bundle) throws RemoteException {
            c cVar = this.f670a.get();
            if (cVar != null) {
                cVar.i(7, bundle, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void G(boolean z10) throws RemoteException {
            c cVar = this.f670a.get();
            if (cVar != null) {
                cVar.i(11, Boolean.valueOf(z10), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void J(boolean z10) throws RemoteException {
        }

        public void K(CharSequence charSequence) throws RemoteException {
            c cVar = this.f670a.get();
            if (cVar != null) {
                cVar.i(6, charSequence, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void W(PlaybackStateCompat playbackStateCompat) throws RemoteException {
            c cVar = this.f670a.get();
            if (cVar != null) {
                cVar.i(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void r(int i10) throws RemoteException {
            c cVar = this.f670a.get();
            if (cVar != null) {
                cVar.i(9, Integer.valueOf(i10), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void s(String str, Bundle bundle) throws RemoteException {
            c cVar = this.f670a.get();
            if (cVar != null) {
                cVar.i(1, str, bundle);
            }
        }

        @Override // android.support.v4.media.session.a
        public void t() throws RemoteException {
            c cVar = this.f670a.get();
            if (cVar != null) {
                cVar.i(13, null, null);
            }
        }

        public void u(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            c cVar = this.f670a.get();
            if (cVar != null) {
                cVar.i(5, list, null);
            }
        }

        public void v() throws RemoteException {
            c cVar = this.f670a.get();
            if (cVar != null) {
                cVar.i(8, null, null);
            }
        }

        public void w(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            c cVar = this.f670a.get();
            if (cVar != null) {
                cVar.i(3, mediaMetadataCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void x(int i10) throws RemoteException {
            c cVar = this.f670a.get();
            if (cVar != null) {
                cVar.i(12, Integer.valueOf(i10), null);
            }
        }

        public void y(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            c cVar = this.f670a.get();
            if (cVar != null) {
                cVar.i(4, parcelableVolumeInfo != null ? new d(parcelableVolumeInfo.f646a, parcelableVolumeInfo.f647b, parcelableVolumeInfo.f648c, parcelableVolumeInfo.f649d, parcelableVolumeInfo.f650e) : null, null);
            }
        }
    }

    public c() {
        if (Build.VERSION.SDK_INT >= 21) {
            new a(this);
        } else {
            this.f668a = new b(this);
        }
    }

    public void a(d dVar) {
    }

    public void b(Bundle bundle) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        i(8, null, null);
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void d(PlaybackStateCompat playbackStateCompat) {
    }

    public void e(List<MediaSessionCompat.QueueItem> list) {
    }

    public void f(CharSequence charSequence) {
    }

    public void g() {
    }

    public void h(String str, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(int i10, Object obj, Bundle bundle) {
    }
}
