package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class AdActivity extends Activity {
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private zzbxv zza;

    private final void zza() {
        zzbxv zzbxvVar = this.zza;
        if (zzbxvVar != null) {
            try {
                zzbxvVar.zzv();
            } catch (RemoteException e10) {
                zzcfi.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i10, int i11, Intent intent) {
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                zzbxvVar.zzg(i10, i11, intent);
            }
        } catch (Exception e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                if (!zzbxvVar.zzE()) {
                    return;
                }
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
        super.onBackPressed();
        try {
            zzbxv zzbxvVar2 = this.zza;
            if (zzbxvVar2 != null) {
                zzbxvVar2.zzh();
            }
        } catch (RemoteException e11) {
            zzcfi.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                zzbxvVar.zzj(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzbxv zzn = zzaw.zza().zzn(this);
        this.zza = zzn;
        if (zzn != null) {
            try {
                zzn.zzk(bundle);
                return;
            } catch (RemoteException e10) {
                zzcfi.zzl("#007 Could not call remote method.", e10);
                finish();
                return;
            }
        }
        zzcfi.zzl("#007 Could not call remote method.", null);
        finish();
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                zzbxvVar.zzl();
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                zzbxvVar.zzn();
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                zzbxvVar.zzo();
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                zzbxvVar.zzp();
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                zzbxvVar.zzq(bundle);
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                zzbxvVar.zzr();
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                zzbxvVar.zzs();
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbxv zzbxvVar = this.zza;
            if (zzbxvVar != null) {
                zzbxvVar.zzt();
            }
        } catch (RemoteException e10) {
            zzcfi.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i10) {
        super.setContentView(i10);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
