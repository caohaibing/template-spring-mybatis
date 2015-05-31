<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#include "/java_pk_name.include"/>

package ${basepackage}.mapper;
import ${basepackage}.model.${className};
import org.apache.ibatis.annotations.Param;
import ${basepackage}.util.MyBatisRepository;

@MyBatisRepository
public interface ${className}Mapper extends BaseMapper<${className}>{
<#list table.columns as column>
<#if column.unique && !column.pk>
        ${className} getBy${column.columnName}(@Param("${column.columnNameLower}") ${column.javaType}  ${column.columnNameLower}) ;
</#if>
</#list>
}
