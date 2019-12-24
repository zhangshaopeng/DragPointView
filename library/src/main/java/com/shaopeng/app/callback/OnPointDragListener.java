package com.shaopeng.app.callback;

import com.shaopeng.app.view.AbsDragPointView;

/**
 * p>@Describe:
 * p>@Company:道理我都农
 * p>@Author:Zhangshaopeng
 * p>@github:https://github.com/zhangshaopeng
 * p>@Data:2019/12/24.
 */

public interface OnPointDragListener {
    /**
     * 开始移除
     *
     * @param view
     */
    void onPointRemoveStart(AbsDragPointView view);

    /**
     * 结束移除
     *
     * @param view
     */
    void onPointRemoveEnd(AbsDragPointView view);

    /**
     * 恢复
     *
     * @param view
     */
    void onPointRecovery(AbsDragPointView view);
}
