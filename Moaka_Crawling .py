from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.ui import WebDriverWait

import pymysql

def insert(obj):
    conn = pymysql.connect(host='1.231.141.99', user='root', password='sunrinhackathon', db='sunrin', charset='utf8')
    try:
        with conn.cursor() as curs:
            sql = f"insert into test(name) values('{obj}')"
            curs.execute(sql)
        conn.commit()
    finally:
        conn.close()

driver=webdriver.Chrome('temp') ##자신의 웹드라이버파일 주소 넣기
driver.implicitly_wait(3)
driver.get('Web') ##웹 주소 넣기
WebDriverWait(driver, 10).until(
                expected_conditions.invisibility_of_element(
                    (By.CLASS_NAME, "map_container fold")
                )
            )
html=driver.page_source
elem=driver.find_element_by_xpath("//*")
source_code = elem.get_attribute("outerHTML")
source=source_code[source_code.find("</button></result-panel-folding-button><router-outlet"):source_code.find("class=\"btn_location\"> 접속위치")]
index=-1
while True:
    index=source.find("search_title_text",index+1)
    end=source.find("</span",index+19)
    if(index==-1):
        break
    numindex=source.find("phone ng-star-inserted",index+1)
    numend=source.find("</span",numindex+24)
    sources = source[index+19:end]+source[numindex+24:numend]
    print(sources)
    insert(sources)

import pymysql
def insert(obj):
        conn = pymysql.connect(host='1.231.141.99', user='root', password='sunrinhackathon', db='sunrin',
                               charset='utf8')
        try:
            with conn.cursor() as curs:
                sql = f"insert into test(name) values('{obj}')"
                curs.execute(sql)
            conn.commit()
        finally:
            conn.close()