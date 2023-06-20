package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class RemoteCreator<T> {
    private final String zza;
    private T zzb;

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class RemoteCreatorException extends Exception {
        @KeepForSdk
        public RemoteCreatorException(String str) {
            super(str);
        }

        @KeepForSdk
        public RemoteCreatorException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public RemoteCreator(String str) {
        this.zza = str;
    }

    @KeepForSdk
    protected abstract T getRemoteCreator(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public final T getRemoteCreatorInstance(Context context) throws RemoteCreatorException {
        if (this.zzb == null) {
            Preconditions.checkNotNull(context);
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null) {
                try {
                    this.zzb = getRemoteCreator((IBinder) remoteContext.getClassLoader().loadClass(this.zza).newInstance());
                } catch (ClassNotFoundException e10) {
                    throw new RemoteCreatorException("Could not load creator class.", e10);
                } catch (IllegalAccessException e11) {
                    throw new RemoteCreatorException("Could not access creator.", e11);
                } catch (InstantiationException e12) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e12);
                }
            } else {
                throw new RemoteCreatorException("Could not get remote context.");
            }
        }
        return this.zzb;
    }
}
