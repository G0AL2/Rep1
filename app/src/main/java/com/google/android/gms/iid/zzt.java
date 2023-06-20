package com.google.android.gms.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzt implements ServiceConnection {
    int state;
    final Messenger zzch;
    zzy zzci;
    final Queue<zzz<?>> zzcj;
    final SparseArray<zzz<?>> zzck;
    final /* synthetic */ zzr zzcl;

    private zzt(zzr zzrVar) {
        this.zzcl = zzrVar;
        this.state = 0;
        this.zzch = new Messenger(new com.google.android.gms.internal.gcm.zzj(Looper.getMainLooper(), new Handler.Callback(this) { // from class: com.google.android.gms.iid.zzu
            private final zzt zzcm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcm = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.zzcm.zzd(message);
            }
        }));
        this.zzcj = new ArrayDeque();
        this.zzck = new SparseArray<>();
    }

    private final void zzt() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zzcl.zzce;
        scheduledExecutorService.execute(new Runnable(this) { // from class: com.google.android.gms.iid.zzw
            private final zzt zzcm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcm = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                zzt zztVar = this.zzcm;
                while (true) {
                    synchronized (zztVar) {
                        if (zztVar.state != 2) {
                            return;
                        }
                        if (zztVar.zzcj.isEmpty()) {
                            zztVar.zzu();
                            return;
                        }
                        zzz<?> poll = zztVar.zzcj.poll();
                        zztVar.zzck.put(poll.zzcp, poll);
                        scheduledExecutorService2 = zztVar.zzcl.zzce;
                        scheduledExecutorService2.schedule(new Runnable(zztVar, poll) { // from class: com.google.android.gms.iid.zzx
                            private final zzt zzcm;
                            private final zzz zzcn;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zzcm = zztVar;
                                this.zzcn = poll;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zzcm.zzg(this.zzcn.zzcp);
                            }
                        }, 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            String valueOf = String.valueOf(poll);
                            StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
                            sb2.append("Sending ");
                            sb2.append(valueOf);
                            Log.d("MessengerIpcClient", sb2.toString());
                        }
                        context = zztVar.zzcl.zzl;
                        Messenger messenger = zztVar.zzch;
                        Message obtain = Message.obtain();
                        obtain.what = poll.what;
                        obtain.arg1 = poll.zzcp;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", poll.zzw());
                        bundle.putString("pkg", context.getPackageName());
                        bundle.putBundle("data", poll.zzcr);
                        obtain.setData(bundle);
                        try {
                            zzy zzyVar = zztVar.zzci;
                            Messenger messenger2 = zzyVar.zzad;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                MessengerCompat messengerCompat = zzyVar.zzco;
                                if (messengerCompat != null) {
                                    messengerCompat.send(obtain);
                                } else {
                                    throw new IllegalStateException("Both messengers are null");
                                    break;
                                }
                            }
                        } catch (RemoteException e10) {
                            zztVar.zzd(2, e10.getMessage());
                        }
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            zzd(0, "Null service connection");
            return;
        }
        try {
            this.zzci = new zzy(iBinder);
            this.state = 2;
            zzt();
        } catch (RemoteException e10) {
            zzd(0, e10.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        zzd(2, "Service disconnected");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzd(Message message) {
        int i10 = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Received response to request: ");
            sb2.append(i10);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        synchronized (this) {
            zzz<?> zzzVar = this.zzck.get(i10);
            if (zzzVar == null) {
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("Received response for unknown request: ");
                sb3.append(i10);
                Log.w("MessengerIpcClient", sb3.toString());
                return true;
            }
            this.zzck.remove(i10);
            zzu();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                zzzVar.zzd(new zzaa(4, "Not supported by GmsCore"));
            } else {
                zzzVar.zzh(data);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean zze(zzz zzzVar) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i10 = this.state;
        if (i10 == 0) {
            this.zzcj.add(zzzVar);
            Preconditions.checkState(this.state == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.state = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = this.zzcl.zzl;
            if (connectionTracker.bindService(context, intent, this, 1)) {
                scheduledExecutorService = this.zzcl.zzce;
                scheduledExecutorService.schedule(new Runnable(this) { // from class: com.google.android.gms.iid.zzv
                    private final zzt zzcm;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzcm = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzcm.zzv();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                zzd(0, "Unable to bind to service");
            }
            return true;
        } else if (i10 == 1) {
            this.zzcj.add(zzzVar);
            return true;
        } else if (i10 == 2) {
            this.zzcj.add(zzzVar);
            zzt();
            return true;
        } else {
            if (i10 != 3 && i10 != 4) {
                int i11 = this.state;
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown state: ");
                sb2.append(i11);
                throw new IllegalStateException(sb2.toString());
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zzg(int i10) {
        zzz<?> zzzVar = this.zzck.get(i10);
        if (zzzVar != null) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Timing out request: ");
            sb2.append(i10);
            Log.w("MessengerIpcClient", sb2.toString());
            this.zzck.remove(i10);
            zzzVar.zzd(new zzaa(3, "Timed out waiting for response"));
            zzu();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zzu() {
        Context context;
        if (this.state == 2 && this.zzcj.isEmpty() && this.zzck.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.state = 3;
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = this.zzcl.zzl;
            connectionTracker.unbindService(context, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zzv() {
        if (this.state == 1) {
            zzd(1, "Timed out while binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zzd(int i10, String str) {
        Context context;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i11 = this.state;
        if (i11 == 0) {
            throw new IllegalStateException();
        }
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                this.state = 4;
                return;
            } else if (i11 == 4) {
                return;
            } else {
                int i12 = this.state;
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown state: ");
                sb2.append(i12);
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.state = 4;
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        context = this.zzcl.zzl;
        connectionTracker.unbindService(context, this);
        zzaa zzaaVar = new zzaa(i10, str);
        for (zzz<?> zzzVar : this.zzcj) {
            zzzVar.zzd(zzaaVar);
        }
        this.zzcj.clear();
        for (int i13 = 0; i13 < this.zzck.size(); i13++) {
            this.zzck.valueAt(i13).zzd(zzaaVar);
        }
        this.zzck.clear();
    }
}
