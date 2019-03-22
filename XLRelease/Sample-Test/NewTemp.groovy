// Exported from:        http://g5-PC:5516/#/templates/Folder9b60853722af42edb52f8faba7b83f82-Release8660d30052c5408eb8f68542bdde9cf9/releasefile
// XL Release version:   8.5.4
// Date created:         Fri Mar 22 12:24:43 IST 2019

xlr {
  template('NewTemp') {
    folder('Sample-Test')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2019-03-22T09:00:00+0530')
    phases {
      phase('New Phase') {
        tasks {
          manual('MyCorpTask') {
            
          }
        }
      }
    }
    
  }
}