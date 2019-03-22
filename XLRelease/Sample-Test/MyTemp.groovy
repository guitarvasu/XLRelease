// Exported from:        http://g5-PC:5516/#/templates/Folder9b60853722af42edb52f8faba7b83f82-Release55fa787aee71479db28cfdad153e48bf/releasefile
// XL Release version:   8.5.4
// Date created:         Fri Mar 22 12:16:31 IST 2019

xlr {
  template('MyTemp') {
    folder('Sample-Test')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2019-03-22T09:00:00+0530')
    phases {
      phase('New Phase') {
        tasks {
          manual('MyTask') {
            
          }
        }
      }
    }
    
  }
}