package cloud.webgen.web.core.autogenerablecrudktl.models

import cloud.webgen.web.starter.annotations.AutoControlable
import cloud.webgen.web.starter.nosql.model.AuditNoSqlModel
import org.springframework.data.mongodb.core.mapping.Document

@Document
@AutoControlable
data class DemoModel(
    val replace: String = ""
): AuditNoSqlModel();