package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class VideoController {
    @KeepForSdk
    public static final int PLAYBACK_STATE_ENDED = 3;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PAUSED = 2;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PLAYING = 1;
    @KeepForSdk
    public static final int PLAYBACK_STATE_READY = 5;
    @KeepForSdk
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object zza = new Object();
    private zzdk zzb;
    private VideoLifecycleCallbacks zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    /* loaded from: classes2.dex */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z10) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    @KeepForSdk
    public int getPlaybackState() {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar == null) {
                return 0;
            }
            try {
                return zzdkVar.zzh();
            } catch (RemoteException e10) {
                zzcfi.zzh("Unable to call getPlaybackState on video controller.", e10);
                return 0;
            }
        }
    }

    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.zza) {
            videoLifecycleCallbacks = this.zzc;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z10;
        synchronized (this.zza) {
            z10 = this.zzb != null;
        }
        return z10;
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar == null) {
                return false;
            }
            try {
                return zzdkVar.zzo();
            } catch (RemoteException e10) {
                zzcfi.zzh("Unable to call isClickToExpandEnabled.", e10);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar == null) {
                return false;
            }
            try {
                return zzdkVar.zzp();
            } catch (RemoteException e10) {
                zzcfi.zzh("Unable to call isUsingCustomPlayerControls.", e10);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar == null) {
                return true;
            }
            try {
                return zzdkVar.zzq();
            } catch (RemoteException e10) {
                zzcfi.zzh("Unable to call isMuted on video controller.", e10);
                return true;
            }
        }
    }

    public void mute(boolean z10) {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar != null) {
                try {
                    zzdkVar.zzj(z10);
                } catch (RemoteException e10) {
                    zzcfi.zzh("Unable to call mute on video controller.", e10);
                }
            }
        }
    }

    public void pause() {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar != null) {
                try {
                    zzdkVar.zzk();
                } catch (RemoteException e10) {
                    zzcfi.zzh("Unable to call pause on video controller.", e10);
                }
            }
        }
    }

    public void play() {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar != null) {
                try {
                    zzdkVar.zzl();
                } catch (RemoteException e10) {
                    zzcfi.zzh("Unable to call play on video controller.", e10);
                }
            }
        }
    }

    public void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzfe zzfeVar;
        synchronized (this.zza) {
            this.zzc = videoLifecycleCallbacks;
            zzdk zzdkVar = this.zzb;
            if (zzdkVar != null) {
                if (videoLifecycleCallbacks == null) {
                    zzfeVar = null;
                } else {
                    try {
                        zzfeVar = new zzfe(videoLifecycleCallbacks);
                    } catch (RemoteException e10) {
                        zzcfi.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", e10);
                    }
                }
                zzdkVar.zzm(zzfeVar);
            }
        }
    }

    public void stop() {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar != null) {
                try {
                    zzdkVar.zzn();
                } catch (RemoteException e10) {
                    zzcfi.zzh("Unable to call stop on video controller.", e10);
                }
            }
        }
    }

    public final zzdk zza() {
        zzdk zzdkVar;
        synchronized (this.zza) {
            zzdkVar = this.zzb;
        }
        return zzdkVar;
    }

    public final void zzb(zzdk zzdkVar) {
        synchronized (this.zza) {
            this.zzb = zzdkVar;
            VideoLifecycleCallbacks videoLifecycleCallbacks = this.zzc;
            if (videoLifecycleCallbacks != null) {
                setVideoLifecycleCallbacks(videoLifecycleCallbacks);
            }
        }
    }
}
