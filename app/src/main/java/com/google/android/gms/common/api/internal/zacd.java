package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.inmobi.media.jh;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zacd<T> implements OnCompleteListener<T> {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey<?> zac;
    private final long zad;
    private final long zae;

    @VisibleForTesting
    zacd(GoogleApiManager googleApiManager, int i10, ApiKey<?> apiKey, long j10, long j11, String str, String str2) {
        this.zaa = googleApiManager;
        this.zab = i10;
        this.zac = apiKey;
        this.zad = j10;
        this.zae = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zacd<T> zaa(GoogleApiManager googleApiManager, int i10, ApiKey<?> apiKey) {
        boolean z10;
        if (googleApiManager.zaF()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if (config == null) {
                z10 = true;
            } else if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            } else {
                z10 = config.getMethodTimingTelemetryEnabled();
                zabq zak = googleApiManager.zak(apiKey);
                if (zak != null) {
                    if (!(zak.zaf() instanceof BaseGmsClient)) {
                        return null;
                    }
                    BaseGmsClient baseGmsClient = (BaseGmsClient) zak.zaf();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration zab = zab(zak, baseGmsClient, i10);
                        if (zab == null) {
                            return null;
                        }
                        zak.zaq();
                        z10 = zab.getMethodTimingTelemetryEnabled();
                    }
                }
            }
            return new zacd<>(googleApiManager, i10, apiKey, z10 ? System.currentTimeMillis() : 0L, z10 ? SystemClock.elapsedRealtime() : 0L, null, null);
        }
        return null;
    }

    private static ConnectionTelemetryConfiguration zab(zabq<?> zabqVar, BaseGmsClient<?> baseGmsClient, int i10) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i10) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i10))) || zabqVar.zac() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<T> task) {
        zabq zak;
        int i10;
        int i11;
        int i12;
        int i13;
        int errorCode;
        long j10;
        long j11;
        int i14;
        if (this.zaa.zaF()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zak = this.zaa.zak(this.zac)) != null && (zak.zaf() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) zak.zaf();
                boolean z10 = true;
                boolean z11 = this.zad > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                if (config != null) {
                    z11 &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    i10 = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration zab = zab(zak, baseGmsClient, this.zab);
                        if (zab == null) {
                            return;
                        }
                        z10 = (!zab.getMethodTimingTelemetryEnabled() || this.zad <= 0) ? false : false;
                        maxMethodInvocationsInBatch = zab.getMaxMethodInvocationsLogged();
                        z11 = z10;
                    }
                    i11 = batchPeriodMillis;
                    i12 = maxMethodInvocationsInBatch;
                } else {
                    i10 = 0;
                    i11 = jh.DEFAULT_BITMAP_TIMEOUT;
                    i12 = 100;
                }
                GoogleApiManager googleApiManager = this.zaa;
                if (task.isSuccessful()) {
                    i13 = 0;
                    errorCode = 0;
                } else {
                    if (task.isCanceled()) {
                        i13 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof ApiException) {
                            Status status = ((ApiException) exception).getStatus();
                            int statusCode = status.getStatusCode();
                            ConnectionResult connectionResult = status.getConnectionResult();
                            errorCode = connectionResult == null ? -1 : connectionResult.getErrorCode();
                            i13 = statusCode;
                        } else {
                            i13 = 101;
                        }
                    }
                    errorCode = -1;
                }
                if (z11) {
                    long j12 = this.zad;
                    j11 = System.currentTimeMillis();
                    j10 = j12;
                    i14 = (int) (SystemClock.elapsedRealtime() - this.zae);
                } else {
                    j10 = 0;
                    j11 = 0;
                    i14 = -1;
                }
                googleApiManager.zay(new MethodInvocation(this.zab, i13, errorCode, j10, j11, null, null, gCoreServiceId, i14), i10, i11, i12);
            }
        }
    }
}
