package com.vehiclecloud.app.videofetch.rndownloader.service;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.format.Formatter;
import android.util.Log;
import androidx.core.app.i;
import androidx.core.app.l;
import androidx.work.Worker;
import androidx.work.g;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceDelta;
import downloader.video.download.free.R;
import free.files.downloader.save.video.manager.MainActivity;
import g0.b;
import java.util.HashMap;
import jb.t;

/* loaded from: classes3.dex */
public final class DownloadNotifier {
    private static final String CHANNEL_ACTIVE = "active";
    private static final String CHANNEL_COMPLETE = "complete";
    private static final String GROUP_KEY_COMPLETE = "com.vehiclecloud.app.videofetch.rndownload.WORK_COMPLETE";
    private static final String GROUP_KEY_DOWNLOAD = "com.vehiclecloud.app.videofetch.rndownload.WORK_DOWNLOAD";
    private static volatile DownloadNotifier INSTANCE = null;
    private static final t<Integer, Integer> STATUS_CODE_MAP = t.a().d(Integer.valueOf((int) DownloadResource.STATUS_PAUSED_BY_APP), Integer.valueOf((int) R.string.download_paused_by_app)).d(Integer.valueOf((int) DownloadResource.STATUS_WAITING_TO_RETRY), Integer.valueOf((int) R.string.download_waiting_retry)).d(Integer.valueOf((int) DownloadResource.STATUS_CANCELED), Integer.valueOf((int) R.string.download_pause)).d(Integer.valueOf((int) DownloadResource.STATUS_INSUFFICIENT_SPACE_ERROR), Integer.valueOf((int) R.string.download_insufficient_space_error)).d(Integer.valueOf((int) DownloadResource.STATUS_FILE_ERROR), Integer.valueOf((int) R.string.download_file_error)).d(Integer.valueOf((int) DownloadResource.STATUS_HTTP_DATA_ERROR), Integer.valueOf((int) R.string.download_http_data_error)).a();
    private static final String TAG = "DownloadNotifier";
    private final l mNotificationManager;
    private final HashMap<String, TaskNotification> taskNotifications = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class TaskNotification {
        public final i.e builder;
        public final int completeId;
        public final String contentTitle;

        /* renamed from: id  reason: collision with root package name */
        public final int f28640id;

        public TaskNotification(int i10, i.e eVar, String str) {
            this.f28640id = i10;
            this.completeId = completeIdOf(i10);
            this.builder = eVar;
            this.contentTitle = str;
        }

        public static int completeIdOf(int i10) {
            return i10 + 7;
        }

        public static TaskNotification create(Context context, DownloadResourceDelta downloadResourceDelta) {
            PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, MainActivity.class), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
            String titleOf = DownloadNotifier.titleOf(downloadResourceDelta);
            return new TaskNotification(notificationIdOf(downloadResourceDelta.f28600id), new i.e(context, "active").k(titleOf).i(activity).B(context.getString(R.string.app_name)).w(false).E(System.currentTimeMillis()).x(R.mipmap.ic_notification).o(DownloadNotifier.GROUP_KEY_DOWNLOAD), titleOf);
        }

        public static int notificationIdOf(String str) {
            return str.hashCode();
        }
    }

    private DownloadNotifier(Context context) {
        this.mNotificationManager = l.f(context);
        createChannel(context);
    }

    private void createChannel(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.e(new NotificationChannel("active", context.getText(R.string.download_running), 1));
            this.mNotificationManager.e(new NotificationChannel(CHANNEL_COMPLETE, context.getText(R.string.download_done), 3));
        }
    }

    public static DownloadNotifier getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (DownloadNotifier.class) {
                if (INSTANCE == null) {
                    Log.d(TAG, "create instance");
                    INSTANCE = new DownloadNotifier(context);
                }
            }
        }
        return INSTANCE;
    }

    private void stopForeground(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "androidx.work.impl.foreground.SystemForegroundService");
        intent.setAction("ACTION_STOP_FOREGROUND");
        try {
            context.startService(intent);
        } catch (Throwable th) {
            timber.log.a.e(th, "stopForeground get ex:", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String titleOf(DownloadResourceDelta downloadResourceDelta) {
        String str = downloadResourceDelta.title;
        return (str == null || str.isEmpty()) ? downloadResourceDelta.f28600id : downloadResourceDelta.title;
    }

    public void cancelResourceAllNotifications(String str) {
        this.mNotificationManager.b(TaskNotification.completeIdOf(TaskNotification.notificationIdOf(str)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g createProgressForegroundInfo(Worker worker, DownloadResourceDelta downloadResourceDelta, long j10, int i10) {
        TaskNotification taskNotification = this.taskNotifications.get(downloadResourceDelta.f28600id);
        if (taskNotification == null) {
            taskNotification = start(worker, downloadResourceDelta);
        }
        if (!(downloadResourceDelta.status == 200)) {
            i.e j11 = taskNotification.builder.t(true).v(100, i10, false).j(null);
            j11.A(b.a("<font color=\"#42a5f5\">" + Formatter.formatShortFileSize(worker.getApplicationContext(), j10) + "/S</font> &nbsp; &nbsp; &nbsp; " + Formatter.formatShortFileSize(worker.getApplicationContext(), downloadResourceDelta.currentBytes) + "/" + Formatter.formatShortFileSize(worker.getApplicationContext(), downloadResourceDelta.totalBytes), 63));
        }
        return new g(taskNotification.f28640id, taskNotification.builder.b());
    }

    public void error(Worker worker, DownloadResourceDelta downloadResourceDelta) {
        stopForeground(worker.getApplicationContext());
        TaskNotification taskNotification = this.taskNotifications.get(downloadResourceDelta.f28600id);
        if (taskNotification == null) {
            return;
        }
        int i10 = downloadResourceDelta.status;
        boolean z10 = i10 == 490;
        Integer num = STATUS_CODE_MAP.get(Integer.valueOf(i10));
        taskNotification.builder.o(GROUP_KEY_COMPLETE).g(CHANNEL_COMPLETE).t(false).f(!z10).j(worker.getApplicationContext().getText(num != null ? num.intValue() : R.string.download_failed)).v(0, 0, false).A(null);
        this.mNotificationManager.h(taskNotification.completeId, taskNotification.builder.b());
    }

    public void progress(Worker worker, DownloadResourceDelta downloadResourceDelta, long j10, int i10) {
        worker.setForegroundAsync(createProgressForegroundInfo(worker, downloadResourceDelta, j10, i10));
    }

    public TaskNotification start(Worker worker, DownloadResourceDelta downloadResourceDelta) {
        TaskNotification taskNotification = this.taskNotifications.get(downloadResourceDelta.f28600id);
        if (taskNotification == null) {
            taskNotification = TaskNotification.create(worker.getApplicationContext(), downloadResourceDelta);
            this.taskNotifications.put(downloadResourceDelta.f28600id, taskNotification);
        } else {
            taskNotification.builder.o(GROUP_KEY_DOWNLOAD).g("active");
        }
        progress(worker, downloadResourceDelta, 0L, 0);
        this.mNotificationManager.b(taskNotification.completeId);
        return taskNotification;
    }

    public void success(Worker worker, DownloadResourceDelta downloadResourceDelta) {
        TaskNotification remove = this.taskNotifications.remove(downloadResourceDelta.f28600id);
        if (remove == null) {
            return;
        }
        remove.builder.o(GROUP_KEY_COMPLETE).g(CHANNEL_COMPLETE).t(false).f(true).j(worker.getApplicationContext().getText(R.string.download_done)).v(0, 0, false).A(null);
        this.mNotificationManager.h(remove.completeId, remove.builder.b());
    }
}
