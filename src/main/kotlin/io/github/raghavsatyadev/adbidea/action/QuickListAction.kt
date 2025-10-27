package io.github.raghavsatyadev.adbidea.action

import com.intellij.ide.actions.QuickSwitchSchemeAction
import com.intellij.openapi.actionSystem.ActionManager
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.DataContext
import com.intellij.openapi.actionSystem.DefaultActionGroup
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project

class QuickListAction : QuickSwitchSchemeAction(), DumbAware {
    override fun fillActions(project: Project?, group: DefaultActionGroup, dataContext: DataContext) {

        if (project == null) {
            return
        }

        addAction("raghavsatyadev.github.io.adbidea.action.UninstallAction", group)
        addAction("raghavsatyadev.github.io.adbidea.action.KillAction", group)
        addAction("raghavsatyadev.github.io.adbidea.action.StartAction", group)
        addAction("raghavsatyadev.github.io.adbidea.action.RestartAction", group)
        addAction("raghavsatyadev.github.io.adbidea.action.ClearDataAction", group)
        addAction("raghavsatyadev.github.io.adbidea.action.ClearDataAndRestartAction", group)
        addAction("raghavsatyadev.github.io.adbidea.action.RevokePermissionsAction", group)
        group.addSeparator()
        addAction("raghavsatyadev.github.io.adbidea.action.StartWithDebuggerAction", group)
        addAction("raghavsatyadev.github.io.adbidea.action.RestartWithDebuggerAction", group)
    }


    private fun addAction(actionId: String, toGroup: DefaultActionGroup) {
        // add action to group if it is available
        ActionManager.getInstance().getAction(actionId)?.let {
            toGroup.add(it)
        }
    }

    override fun isEnabled() = true
    override fun getPopupTitle(e: AnActionEvent) = "ADB Operations Popup"
}