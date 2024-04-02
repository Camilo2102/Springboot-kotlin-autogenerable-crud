package cloud.webgen.web.core.autogenerablecrudktl.repository

import cloud.webgen.web.core.autogenerablecrudktl.models.DemoModel
import cloud.webgen.web.starter.nosql.repository.AuditNoSqlRepository
import org.springframework.stereotype.Repository

@Repository
interface DemoRepository: AuditNoSqlRepository<DemoModel> {
}